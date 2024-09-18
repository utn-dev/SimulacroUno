package Model;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private Integer id;
    private String name;
    private Double price;
    private TypeVehicle type;

    public Vehicle(Integer id, String name, Double price, TypeVehicle type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public TypeVehicle getType() {
        return type;
    }

    public void setType(TypeVehicle type) {
        this.type = type;
    }


    public abstract Double calculatePrice(Double percentage);

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name='" + name + '\'' + ", price=" + new DecimalFormat("#0.00").format(price) + ", type=" + type + '}';
    }
}
