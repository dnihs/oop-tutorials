package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping(path = "/info")
    public String info(){
        return "This application demonstrates basic REST API development using Spring Boot.";
    }

}
