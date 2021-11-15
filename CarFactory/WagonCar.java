package factory;

public class WagonCar extends Car{
    public WagonCar(String m,String l){
        super(m,l);
    }
    public void assignCarPrice(){
        this.price=15000;
        System.out.println("Price: "+this.price);
    }
    @Override
    public void displayBrand() {
        System.out.println("Model: "+this.model);
        System.out.println("location: "+this.location);
        System.out.println("Brand: Ford Fiesta");
    }
}
