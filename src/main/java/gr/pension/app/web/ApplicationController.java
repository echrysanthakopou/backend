package gr.pension.app.web;

import gr.pension.app.persistence.dao.ApplicationDAO;
import gr.pension.app.persistence.dao.UserEntityDAO;
import gr.pension.app.persistence.entity.ApplicationEntity;
import gr.pension.app.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ApplicationController {

    @Autowired
    private ApplicationDAO applicationDAO;

    @Autowired
    private UserEntityDAO userEntityDAO;

    @Autowired
    private JavaMailSenderImpl javaMailSender;

    @ResponseBody
    @PostMapping(value = "/applicationCreate")
    public Boolean createApp(@RequestBody ApplicationEntity app) {

        System.out.println("Received" + app.toString() + "}\n");

        applicationDAO.save(app);

        UserEntity user = userEntityDAO.findUserEntityByEmail(app.getEmail());
        if (user == null) {
            return false;
        }
        user.setPassword("password");
        userEntityDAO.save(user);

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(app.getEmail());
        msg.setFrom("info@pension.com");
        msg.setSubject("Δημιουργία νέας αίτησης");
        msg.setText(" Σας ενημερωνούμε ότι έχει δημιουργήθει μια νέα αιτήση στο όνομα σας.");
        javaMailSender.send(msg);

        return true;
    }

    @ResponseBody
    @PostMapping(value = "/getApplication")
    public List<ApplicationEntity> createApp(@RequestBody String mail) {

        if (mail.equals("admin")) {
            return applicationDAO.findAll();
        } else {
            return applicationDAO.findAllByEmail(mail);
        }
    }

    @ResponseBody
    @PostMapping(value = "/getApplicationById")
    public ApplicationEntity getApplicationById(@RequestBody String id) {
        return applicationDAO.findById(Integer.parseInt(id)).orElse(null);
    }


    @ResponseBody
    @PostMapping(value = "/delete")
    public Boolean deleteApplication(@RequestBody String id) {

        applicationDAO.deleteById(Integer.parseInt(id));
        return true;
    }

    @ResponseBody
    @PostMapping(value = "/approved")
    public Boolean approved(@RequestBody String id) {

        ApplicationEntity app =  applicationDAO.findById(Integer.parseInt(id)).orElse(null);
        if (app != null) {
            app.setStatus("Εγκρίθηκε");
            applicationDAO.save(app);
        }
        return true;
    }

    @ResponseBody
    @PostMapping(value = "/clickDiapproved")
    public Boolean clickDisapproved(@RequestBody String id) {

        ApplicationEntity app = applicationDAO.findById(Integer.parseInt(id)).orElse(null);
        if (app != null) {
            app.setStatus("Απόρριψη");
            applicationDAO.save(app);
        }

        return true;
    }


    @ResponseBody
    @PostMapping(value = "/searchApplication")
    public Boolean searchApplication(@RequestBody ApplicationController search) {
        System.out.println("Create User with data" + search + "}\n");

        return true;
    }


}