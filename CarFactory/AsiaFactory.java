package factory;

public class AsiaFactory extends CarFactory{
    public AsiaFactory(String c) {
        super(c);
    }
    @Override
    public Car buildCar(String m) {
        if(m.equalsIgnoreCase("Sedan")) {
            Car new_car = new SedanCar("Sedan", this.city);
            return new_car;
        }
        if(m.equalsIgnoreCase("Wagon")) {
            Car new_car = new WagonCar("Wagon", this.city);
            return new_car;
        }
        return null;
    }
}
