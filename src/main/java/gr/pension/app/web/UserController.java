package gr.pension.app.web;

import gr.pension.app.dao.HistoryworkingEntityDAO;
import gr.pension.app.dao.UserEntityDAO;
import gr.pension.app.datatypes.LoginDetails;
import gr.pension.app.model.data;
import gr.pension.app.model.entities.HistoryworkingEntity;
import gr.pension.app.model.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public Boolean createUser1(@RequestBody UserEntity user) {


        System.out.println("Create User with data" +user.toString()+ "}\n");
        userEntityDAO.save(user);

        return true;
        //return null;


    }


    @ResponseBody
    @PostMapping(value = "/login", headers = "Accept=application/x-www-form-urlencoded;harset=UTF-8")
    public String login(@RequestBody LoginDetails loginData)  {


        System.out.println("Received " +loginData.toString()+ "\n");
        //List<userE
        List<UserEntity> users = userEntityDAO.findAll();


        for (UserEntity user:users
             ) {
            System.out.println("looping, cur User" + user.getEmail()+" pass " +user.getPassword() );
            if (user.getEmail().equals(loginData.getName())&& user.getPassword().equals(loginData.getPassword())){
                System.out.println("Found");
                return "Login Successful!";
            }
        }

        return "logged User Error";

    }
}