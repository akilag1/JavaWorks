package factory;

public class SedanCar extends Car{
    public SedanCar(String m,String l){
        super(m,l);
    }
    public void assignCarPrice(){
        this.price=290000;
        System.out.println("Price: "+this.price);
    }
    @Override
    public void displayBrand() {
        System.out.println("Model: "+this.model);
        System.out.println("location: "+this.location);
        System.out.println("Brand: Rolls Royce Ghost");
    }
}
