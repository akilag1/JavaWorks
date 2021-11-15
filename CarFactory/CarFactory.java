package factory;

public abstract class CarFactory {
    public String city;
    public CarFactory(String c){
        this.city=c;
    }
    public abstract Car buildCar(String m);
}
