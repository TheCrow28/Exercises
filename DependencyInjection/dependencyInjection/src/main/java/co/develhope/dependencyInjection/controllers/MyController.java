package co.develhope.dependencyInjection.controllers;

import co.develhope.dependencyInjection.services.MyServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyServices myServices;

    public MyController(MyServices myServices){
        System.out.println("MyController constructor called");
        this.myServices = myServices;
    }

    @GetMapping("/getName")
    public String getName(){
        return myServices.getName();
    }

    @GetMapping
    public String welcomeMsg(){
        return "Welcome";
    }
}
