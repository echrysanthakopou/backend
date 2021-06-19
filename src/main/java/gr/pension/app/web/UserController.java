package gr.pension.app.web;

import gr.pension.app.dao.HistoryworkingEntityDAO;
import gr.pension.app.dao.UserEntityDAO;
import gr.pension.app.model.data;
import gr.pension.app.model.entities.HistoryworkingEntity;
import gr.pension.app.model.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class UserController {
    public static Integer user = 1;



    @Autowired
    private UserEntityDAO   userEntityDAO;


//    @ResponseBody
//    @PostMapping("/getNotes")
//    public HistoryworkingEntity getNotes(@RequestBody data name)  {
//
//        System.out.println("test " +name+ "}\n");
//
//        return historyworkingEntityDAO.findById(Integer.parseInt(name.getName())).orElse(null);
//    }





    @ResponseBody
    @PostMapping(value = "/createUSer")
    public Boolean createUser(@RequestBody UserEntity user) {


        System.out.println("Create User with data" +user.toString()+ "}\n");
        userEntityDAO.save(user);

        return true;
        //return null;


    }


    @ResponseBody
    @PostMapping(value = "/createUSer")
    public Boolean userExist(@RequestBody String  userName) {


        System.out.println("Create User with data" +userName+ "}\n");

        //User exist
        return true;
    }

    @ResponseBody
    @PostMapping(value = "/login")
    public String testingApi(@RequestBody  String name, @RequestBody  String password) {


        System.out.println("test " +name+ "}\n");

        return "logged User";
        //return null;


    }
}