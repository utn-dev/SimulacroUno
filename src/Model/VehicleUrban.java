package Model;

public class VehicleUrban extends Vehicle {

    private Integer cantMaxPassenger;
    private Integer airbag;

    public VehicleUrban(Integer id, String name, Double price, Integer cantMaxPassenger, Integer airbag) {
        super(id, name, price, TypeVehicle.AUTOMOVIL);
        this.cantMaxPassenger = cantMaxPassenger;
        this.airbag = airbag;
    }

    public Integer getCantMaxPassenger() {
        return cantMaxPassenger;
    }

    public void setCantMaxPassenger(Integer cantMaxPassenger) {
        this.cantMaxPassenger = cantMaxPassenger;
    }

    public Integer getAirbag() {
        return airbag;
    }

    public void setAirbag(Integer airbag) {
        this.airbag = airbag;
    }


    @Override
    public Double calculatePrice( Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public String toString() {
        return super.toString() + "VehicleUrban{" +
                "cantMaxPassenger=" + cantMaxPassenger +
                ", airbag=" + airbag +
                '}';
    }
}
