package co.develhope.dependencyInjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent(){
        this.myComponentName = "Andrea Visentin";
        System.out.println("MyComponent constructor called");
    }

    public String getMyComponentName(){
        System.out.println("getMyComponentName method called");
        return myComponentName;
    }
}
