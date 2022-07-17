package co.develhope.logging.controllers;


import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private BasicService basicService;

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public void welcomeMessage(){
        logger.info("Welcome");
    }

    @GetMapping("/exp")
    public void getExp(){
        basicService.getPower();
        logger.info("The calculation is finished");
    }

    @GetMapping("/get-errors")
    public void getErrors(){
        logger.error("This is the ERROR logging");
    }
}
