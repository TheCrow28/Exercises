package co.develhope.First.Api2.Controllers;

import co.develhope.First.Api2.Services.MyServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    private MyServices myServices;

    public FactorialController(MyServices myServices){
        this.myServices = myServices;
    }

    @GetMapping(value = "/factorial/{n}")
    public Long Factorial(@PathVariable Integer n){
        return myServices.getFactorial(n);
    }
}
