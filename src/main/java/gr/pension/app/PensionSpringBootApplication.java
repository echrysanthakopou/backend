package gr.pension.app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class PensionSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(PensionSpringBootApplication.class, args);
    }
}
