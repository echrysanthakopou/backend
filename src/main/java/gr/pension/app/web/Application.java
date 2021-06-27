package gr.pension.app.web;

import gr.pension.app.dao.ApplicationDAO;
import gr.pension.app.model.entities.ApplicationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class Application {
    public static Integer user = 1;



    @Autowired
    private ApplicationDAO applicationDAO;




    @ResponseBody
    @PostMapping(value = "/applicationCreate")
    public Boolean createApp(@RequestBody ApplicationEntity app) {


        System.out.println("Received" +app.toString()+ "}\n");


        applicationDAO.save(app);
        return true;
        //return null;


    }

    @ResponseBody
    @PostMapping(value = "/getApplication")
    public List<ApplicationEntity> createApp(@RequestBody String mail) {





        return
                applicationDAO.findAllByEmail(mail);
        //return null;


    }


    @ResponseBody
    @PostMapping(value = "/searchApplication")
    public Boolean searchApplication(@RequestBody Application search) {


        System.out.println("Create User with data" +search+ "}\n");

        //Application found
        return true;
    }


}