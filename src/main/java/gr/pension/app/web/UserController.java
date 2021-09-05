package gr.pension.app.web;

import gr.pension.app.persistence.dao.UserEntityDAO;
import gr.pension.app.dto.LoginDetails;
import gr.pension.app.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserEntityDAO   userEntityDAO;

    @ResponseBody
    @PostMapping(value = "/createuser")
    public Boolean createUser1(@RequestBody UserEntity user) {

        System.out.println("Create User with data" +user.toString()+ "}\n");
        userEntityDAO.save(user);

        return true;

    }

    @ResponseBody
    @PostMapping(value = "/findUser")
    public UserEntity findUser(@RequestBody LoginDetails loginData) {

        System.out.println("find user with mail" +loginData.getName()+ "}\n");
        return userEntityDAO.findUserEntityByEmail(loginData.getName());

    }


    @ResponseBody
    @PostMapping(value = "/findUsers")
    public List<UserEntity> findUsers() {


        //System.out.println("find user with mail" +loginData.getName()+ "}\n");
        return userEntityDAO.findAll();
    }


    @ResponseBody
    @PostMapping(value = "/deleteUsers")
    public Boolean deleteApplication(@RequestBody String email) {

        UserEntity user=userEntityDAO.findUserEntityByEmail(email);
        if(user==null)
        {
            return false;
        }
        userEntityDAO.deleteById(user.getId());
        return true;
    }

    @ResponseBody
    @PostMapping(value = "/login", headers = "Accept=application/x-www-form-urlencoded;harset=UTF-8")
    public String login(@RequestBody LoginDetails loginData)  {

        if(loginData.getName().equals("admin"))
        {
            if (loginData.getPassword().equals("admin")){
                return "Login Successful!";
            }
            else {
                return "logged User Error";
            }
        }

        System.out.println("Received " + loginData + "\n");
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