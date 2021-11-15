package factory;

public class SportsCar extends Car{
    public SportsCar(String m,String l){
        super(m,l);
    }
    public void assignCarPrice(){
        this.price=550000;
        System.out.println("Price: "+this.price);
    }
    @Override
    public void displayBrand() {
        System.out.println("Model: "+this.model);
        System.out.println("location: "+this.location);
        System.out.println("Brand: Lamborghini Aventador");
    }
}
