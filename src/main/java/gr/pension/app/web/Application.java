package gr.pension.app.web;

import gr.pension.app.dao.ApplicationDAO;
import gr.pension.app.dao.UserEntityDAO;
import gr.pension.app.model.entities.ApplicationEntity;
import gr.pension.app.model.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class Application {
    public static Integer user = 1;


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

        String password="password";

        UserEntity user=userEntityDAO.findUserEntityByEmail(app.getEmail());
        if (user==null)
        {
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
        //return null;


    }

    @ResponseBody
    @PostMapping(value = "/getApplication")
    public List<ApplicationEntity> createApp(@RequestBody String mail) {

        if (mail.equals("admin")) {
            return
                    applicationDAO.findAll();
        }else{

            return
                    applicationDAO.findAllByEmail(mail);
        }
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


        List<ApplicationEntity> app=applicationDAO.findAllById(Integer.parseInt(id));
        if (app.size()>0)
        {
            app.get(0).setStatus("Εγκρίθηκε");
            applicationDAO.save(app.get(0));
        }
           //applicationDAO.deleteById(Integer.parseInt(id));
           return true;
    }

    @ResponseBody
    @PostMapping(value = "/clickDiapproved")
    public Boolean clickDiapproved(@RequestBody String id) {


        List<ApplicationEntity> app=applicationDAO.findAllById(Integer.parseInt(id));
        if (app.size()>0)
        {
            app.get(0).setStatus("Απόρριψη");
            applicationDAO.save(app.get(0));
        }
           //applicationDAO.deleteById(Integer.parseInt(id));
           return true;
    }


    @ResponseBody
    @PostMapping(value = "/searchApplication")
    public Boolean searchApplication(@RequestBody Application search) {


        System.out.println("Create User with data" + search + "}\n");

        //Application found
        return true;
    }


}