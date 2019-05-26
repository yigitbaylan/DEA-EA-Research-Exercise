package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//
//    @PostConstruct
//    public void init(){
//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));   // It will set UTC timezone
//    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}