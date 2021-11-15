package factory;

public class driver {
    public static void main(String[] args){
        CarFactory usa_factory=new USAFactory("New York");
        CarFactory asia_factory=new AsiaFactory("Tokyo");
        Car car1=asia_factory.buildCar("Sedan");
        Car car2=usa_factory.buildCar("Sports");
        Car car3=usa_factory.buildCar("Sedan");
        Car car4=asia_factory.buildCar("Wagon");
        Car cars[]={car1,car2,car3,car4};
        for(int i=0;i<cars.length;i++){
            cars[i].displayBrand();
            cars[i].assignCarPrice();
            System.out.println("\n");
        }
    }
}
