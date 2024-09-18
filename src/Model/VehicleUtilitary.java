package Model;

public class VehicleUtilitary extends Vehicle {


    private Double kgMAx;
    private Double height;


    public VehicleUtilitary(Integer id, String name, Double price, Double kgMAx, Double height) {
        super(id, name, price, TypeVehicle.UTILITARIO);
        this.kgMAx = kgMAx;
        this.height = height;
    }

    public Double getKgMAx() {
        return kgMAx;
    }

    public void setKgMAx(Double kgMAx) {
        this.kgMAx = kgMAx;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice() * percentage;
    }

    @Override
    public String toString() {
        return super.toString() + "VehicleUtilitary{" +
                "kgMAx=" + kgMAx +
                ", height=" + height +
                '}';
    }
}
