package gr.pension.app.Server;



import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication ( exclude = {SecurityAutoConfiguration.class} )
//@Import(MySecurityConfiguration.class)
@ComponentScan("gr.pension.app")
@EntityScan("gr.pension.app")
@EnableJpaRepositories("gr.pension.app")

public class MainServer {
    private static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        logger.info("Pension server started");
        logger.setLevel(Level.ALL);
        SpringApplication.run(MainServer.class, args);


    }

}
