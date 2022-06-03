package co.develhope.dependencyInjection.services;

import co.develhope.dependencyInjection.components.MyComponent;
import org.springframework.stereotype.Service;

@Service
public class MyServices {

    private MyComponent myComponent;

    public MyServices(MyComponent myComponent){
        System.out.println("MyServices constructor called");
        this.myComponent = myComponent;
    }

    public String getName(){
        System.out.println("getName method called");
        return myComponent.getMyComponentName();
    }
}
