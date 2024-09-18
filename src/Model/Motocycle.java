package Model;

import Interface.Race;

public class Motocycle extends Vehicle implements Race {

    private Double displacement;

    public Motocycle(Integer id, String name, Double price, Double displacement) {
        super(id, name, price, TypeVehicle.MOTOCICLETA);
        this.displacement = displacement;
    }

    public Double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Double displacement) {
        this.displacement = displacement;
    }


    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public String toString() {
        return super.toString() + "Motocycle{" +
                "displacement=" + displacement +
                '}';
    }

    @Override
    public void race() {
        System.out.println(getName() + " compite con una cilindrada de: " + this.displacement + " cc");
    }
}
