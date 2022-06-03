package co.develhope.Swagger02.Controllers;

import co.develhope.Swagger02.Entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping(value = "")
    @ApiOperation(value = "The welcome math message", notes = "Prints a welcome message for the user")
    public String welcomeMathMsg(){
        return "Welcome to Math!";
    }

    @GetMapping(value = "/division-info")
    @ApiOperation(value = "Get info about the division", notes = "Gives back to the user the info about the division")
    public ArithmeticOperation arithmeticOperation(){
        String[] properties = {"Division by 1", "Division by 0", "Division by itself", "Division of 0 by any number"};
        return new ArithmeticOperation("Division", 2, "Division arithmetic operation", properties);
    }

    @GetMapping(value = "/multiplication")
    @ApiOperation(value = "Execute a multiplication", notes = "Gives back to the user the result of the multiplication of 2 given parameters")
    public int getMultiplication(
            @ApiParam(value = "The first parameter") @RequestParam(required = true) int n1,
            @ApiParam(value = "The second parameter") @RequestParam(required = true) int n2
    ){
        return n1 * n2;
    }

    @GetMapping(value = "/square/{n}")
    @ApiOperation(value = "Execute the square of a given number", notes = "Gives back to the user the result of the square of a given number")
    public int getSquare(@ApiParam(value = "The number that we want to square") @PathVariable() int n){
        return n * n;
    }
}
