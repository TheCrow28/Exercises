package co.develhope.FirstApi05.Controllers;

import co.develhope.FirstApi05.DTO.CarDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CarController {

    @GetMapping("/car")
        public String getNewCar(){
            return new CarDTO("Audi", "A3", 5000.0).toString();
        }

    @PostMapping("/car")
    public void getCarBody(@Valid @RequestBody CarDTO car, HttpServletResponse response){
        System.out.println(car.toString());
        response.setStatus(201);
    }
}
