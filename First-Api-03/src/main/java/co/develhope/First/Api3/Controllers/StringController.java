package co.develhope.First.Api3.Controllers;

import co.develhope.First.Api3.Services.MyServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    private MyServices myServices;

    public StringController(MyServices myServices){
        this.myServices = myServices;
    }

    @GetMapping("/string")
    public String getStrings(@RequestParam(required = true)String string1, @RequestParam(required = false)String string2){
        return myServices.getString(string1, string2);
    }






}
