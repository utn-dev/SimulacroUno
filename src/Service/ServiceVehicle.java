package Service;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ServiceVehicle {

    private List<Vehicle> inventary;

    public ServiceVehicle() {
        this.inventary = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        inventary.add(v);
    }

    public List<Vehicle> showInventary() {
        return inventary;
    }

    public List<Vehicle> newPrice() {
        List<Vehicle> aux = new ArrayList<>();
        for (Vehicle v : inventary) {
            Double percentage = 0d;
            if (v instanceof VehicleUrban)
                percentage = 1.15;
            if (v instanceof VehicleRace)
                percentage = 1.20;
            if (v instanceof VehicleUtilitary)
                percentage = 1.10;
            if (v instanceof Motocycle)
                percentage = 1.05;
            v.setPrice(v.calculatePrice(percentage));
            aux.add(v);
        }
        return aux;
    }
}
