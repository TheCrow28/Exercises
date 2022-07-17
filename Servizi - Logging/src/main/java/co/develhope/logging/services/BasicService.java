package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @Autowired
    private Environment environment;

    public void getPower(){
        int n1 = Integer.parseInt(environment.getProperty("customEnvs.n1"));
        int n2 = Integer.parseInt(environment.getProperty("customEnvs.n2"));
        logger.info("The calculation is starting");
        System.out.println(n1*n1 + " " + n2*n2);
    }
}
