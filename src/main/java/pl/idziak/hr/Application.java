package pl.idziak.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // TODO: Actuator - health checking
    // TODO: storing files on disk
    // TODO: cache storage
    // TODO: Security - users, roles
    // TODO: UUID4 based identification
    // TODO: reactive streams
    // TODO: pagination

}
