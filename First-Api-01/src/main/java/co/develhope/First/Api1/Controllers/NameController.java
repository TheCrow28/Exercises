package co.develhope.First.Api1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName(){
        return "Andrea";
    }

    @PostMapping(value = "/name")
    public String getReversedName(){
        return "Aerdna";
    }
}
