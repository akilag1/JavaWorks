package factory;

public class USAFactory extends  CarFactory{
    public USAFactory(String c) {
        super(c);
    }
    @Override
    public Car buildCar(String m) {
        if(m.equalsIgnoreCase("Sedan")) {
            Car new_car = new SedanCar("Sedan", this.city);
            return new_car;
        }
        if(m.equalsIgnoreCase("Sports")) {
            Car new_car = new SportsCar("Sports", this.city);
            return new_car;
        }
        return null;
    }
}
