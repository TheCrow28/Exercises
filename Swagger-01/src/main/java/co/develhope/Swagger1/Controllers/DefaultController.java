package co.develhope.Swagger1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        return "Welcome";
    }


}
