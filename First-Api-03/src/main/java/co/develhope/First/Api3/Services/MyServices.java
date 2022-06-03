package co.develhope.First.Api3.Services;

import org.springframework.stereotype.Service;

@Service
public class MyServices {

    public String getString(String string1, String string2){
        if(string2 == null){
            return string1;
        } else return string1 + " " + string2;
    }
}
