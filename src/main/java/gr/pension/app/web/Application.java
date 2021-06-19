package gr.pension.app.web;

import gr.pension.app.dao.UserEntityDAO;
import gr.pension.app.model.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class Application {
    public static Integer user = 1;



    @Autowired
    private UserEntityDAO   userEntityDAO;




    @ResponseBody
    @PostMapping(value = "/applicationCreate")
    public Boolean createApp(@RequestBody Application app) {


        System.out.println("Create User with data" +app.toString()+ "}\n");
//        userEntityDAO.save(user);

        return true;
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