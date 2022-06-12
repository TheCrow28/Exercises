package co.develhope.crud.controllers;

import co.develhope.crud.entities.Car;
import co.develhope.crud.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping("")
    public Car createCar(@RequestBody Car car){
        return carRepository.save(car);
    }

    @GetMapping("")
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable long id){
        if (carRepository.existsById(id))
        return carRepository.getById(id);
        else
            return new Car();
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable long id, @RequestParam String type){
        Car car;
        if (carRepository.existsById(id)){
            car = carRepository.getById(id);
            car.setType(type);
            car = carRepository.save(car);
        }else{
            car = new Car();
        }
        return car;
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable long id, HttpServletResponse response){
        if (carRepository.existsById(id))
            carRepository.deleteById(id);
        else
            response.setStatus(409);
    }

    @DeleteMapping("")
    public void deleteAll(){
        carRepository.deleteAll();
    }

}
