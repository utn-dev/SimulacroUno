import Model.*;
import Service.ServiceVehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceVehicle serviceVehicle = new ServiceVehicle();

        List<Vehicle> auxOriginal;
        List<Vehicle> auxNewPrice;

        VehicleUrban VehicleUrban = new VehicleUrban(1, "Toyota Corolla", 22000000.0, 5, 6);
        VehicleUtilitary VehicleUtilitary = new VehicleUtilitary(2, "Ford F150", 35000000.0, 1200.0, 2.5);
        VehicleRace VehicleRace = new VehicleRace(3, "Ferrari", 50000000.0, 320);
        Motocycle Motocycle = new Motocycle(4, "Harley Davidson", 750000.0, 700.0);

        serviceVehicle.addVehicle(VehicleUrban);
        serviceVehicle.addVehicle(VehicleUtilitary);
        serviceVehicle.addVehicle(VehicleRace);
        serviceVehicle.addVehicle(Motocycle);

        VehicleRace.race();
        System.out.println(VehicleUtilitary);


        auxOriginal = serviceVehicle.showInventary();
        for (Vehicle v : auxOriginal) {
            System.out.println(v);
        }

        System.out.println("Valores actualizados de precios para la venta");
        auxNewPrice = serviceVehicle.newPrice();
        for (Vehicle v : auxNewPrice) {
            System.out.println(v);
        }

    }
}