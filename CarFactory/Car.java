package factory;

import java.util.Date;

public abstract class Car implements IBrand {
    public String model;
    public String location;
    public Date manufacturedDate;
    public double price;
    public String color;
    public Car(String m,String l){
        this.model=m;
        this.location=l;
        manufacturedDate=new Date();
    }
    public void modify(String c){
        this.color=c;
    }
    public abstract void assignCarPrice();
    public abstract void displayBrand();
}
