package co.develhope.Swagger02.Controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping
    @ApiOperation(value = "Welcome message for the user")
    public String welcomeMsg(){
        return "Welcome";
    }
}
