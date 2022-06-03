package co.develhope.Swagger1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

       @GetMapping
       public String getName(){
           return "My name is Andrea";
       }

}
