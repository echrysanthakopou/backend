package gr.pension.app.web;

import gr.pension.app.persistence.dao.ApplicationDAO;
import gr.pension.app.persistence.dao.UserEntityDAO;
import gr.pension.app.dto.LoginDetails;
import gr.pension.app.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

@RestController
@CrossOrigin(origins = "*")
public class MailSend {
    public static Integer user = 1;



    @Autowired
    private ApplicationDAO applicationDAO;


    @Autowired
    private JavaMailSenderImpl javaMailSender;



    @Autowired
    private UserEntityDAO userEntityDAO;



    @ResponseBody
    @PostMapping(value = "/reset", headers = "Accept=application/x-www-form-urlencoded;harset=UTF-8")
    public String login(@RequestBody LoginDetails resetData) throws MessagingException {

        System.out.println("Mail "+ resetData.toString());
        UserEntity user=userEntityDAO.findUserEntityByEmail(resetData.getName());
        {
            if(user==null)
            {
                return "false";
            }
        }

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String password = buffer.toString();

        user.setPassword(password);

        userEntityDAO.save(user);


        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(resetData.getName());
        msg.setFrom("info@pension.com");
        msg.setSubject("Eπαναφορά του κωδικού");
        msg.setText("Προσωρινός κωδικός "+ password);
        javaMailSender.send(msg);



        return "false";
    }




}