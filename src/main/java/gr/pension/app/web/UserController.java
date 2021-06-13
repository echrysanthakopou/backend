package gr.pension.app.web;

import gr.pension.app.dao.HistoryworkingEntityDAO;
import gr.pension.app.model.data;
import gr.pension.app.model.entities.HistoryworkingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class UserController {
    public static Integer user = 1;


    @Autowired
    private HistoryworkingEntityDAO historyworkingEntityDAO;


    @ResponseBody
    @PostMapping("/getNotes")
    public HistoryworkingEntity getNotes(@RequestBody data name)  {

        System.out.println("test " +name+ "}\n");

        return historyworkingEntityDAO.findById(Integer.parseInt(name.getName())).orElse(null);
    }




    @ResponseBody
    @PostMapping(value = "/test")
    public String getBeeHives1(@RequestBody  String name) {


        System.out.println("test " +name+ "}\n");

        return "test";
        //return null;


    }

}