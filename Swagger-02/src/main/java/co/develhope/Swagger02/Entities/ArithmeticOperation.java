package co.develhope.Swagger02.Entities;

import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;

public class ArithmeticOperation {

    @ApiModelProperty(value = "The name of the arithmetic operation", example = "Multiplication")
    private String name;
    @ApiModelProperty(value = "Minimum number of operands ", example = "2")
    private int minNumberOfOperands;
    @ApiModelProperty(value = "The description of the operation")
    private String description;
    @ApiModelProperty(value = "A list of properties" )
    private String[] properties;

    public ArithmeticOperation(String division, int i, String division_arithmetic_operation, String[] properties) {
        this.name = division;
        this.minNumberOfOperands = i;
        this.description = division_arithmetic_operation;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ArithmeticOperation{" +
                "name='" + name + '\'' +
                ", minNumberOfOperands=" + minNumberOfOperands +
                ", description='" + description + '\'' +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public String getName() {
        return name;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMinNumberOfOperands(int minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
