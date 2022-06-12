package co.develhope.crud.entities;


import javax.persistence.*;

@Entity
@Table
public class Car {

    public Car(){
    }

    public Car(long id, String modelName, String type) {
        this.id = id;
        this.modelName = modelName;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public String getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String modelName;
    private String type;
}
