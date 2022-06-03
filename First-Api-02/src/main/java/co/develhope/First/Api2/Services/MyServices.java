package co.develhope.First.Api2.Services;

import org.springframework.stereotype.Service;

@Service
public class MyServices {

    public long getFactorial(int n){
        long fact = 1;
        for ( int i = 2; i<=n ; i++){
            fact = fact * i;
        }  return fact;
    }
}
