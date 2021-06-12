package gr.pension.app.web;

import gr.pension.app.dao.NotesDAO;
import gr.pension.app.model.data;
import gr.pension.app.model.entitiesNew.HistoryworkingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
public class UserController {
    public static Integer user = 1;


    @Autowired
    private NotesDAO notesDAO;


    @ResponseBody
    @PostMapping("/getNotes")
    public HistoryworkingEntity getNotes(@RequestBody data name)  {

        System.out.println("test " +name+ "}\n");

        return notesDAO.findById(Integer.parseInt(name.getName())).orElse(null);
    }




    @ResponseBody
    @PostMapping(value = "/test")
    public String getBeeHives1(@RequestBody  String name) {


        System.out.println("test " +name+ "}\n");

        return "test";
        //return null;


    }

}