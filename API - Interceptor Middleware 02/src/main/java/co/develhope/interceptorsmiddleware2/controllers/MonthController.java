package co.develhope.interceptorsmiddleware2.controllers;


import co.develhope.interceptorsmiddleware2.entities.Month;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;



@RestController
@RequestMapping("/month")
public class MonthController {


    @GetMapping("")
    public Month get(HttpServletRequest request) {
        Month month = (Month) request.getAttribute("Month");
        return month;
    }

}
