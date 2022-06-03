package co.develhope.FirstApi05.DTO;

import lombok.AllArgsConstructor;
import lombok.ToString;
import javax.validation.constraints.NotBlank;


//@ToString
//@AllArgsConstructor
public class CarDTO {

    public CarDTO(String id, String modelName, double price){
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDTO{" + "Id: " + id + " , ModelName: " + modelName + " , Price: " + price + "}";
    }

    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String modelName;
    private double price;


}
