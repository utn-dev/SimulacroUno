package Model;

import Interface.Race;

public class VehicleRace extends Vehicle implements Race {

    private double maxVelocity;

    public VehicleRace(Integer id, String name, Double price, double maxVelocity) {
        super(id, name, price, TypeVehicle.CARRERA);
        this.maxVelocity = maxVelocity;
    }


    public double getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }


    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public void race() {
        System.out.println(getName() + " compite a una velocidad máxima de: " + this.maxVelocity + " km/h");
    }
}
