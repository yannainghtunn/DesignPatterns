package dp.decorator;

public class Main {
    public static void main(String... args) {
        Car c=new SportsCar(new LuxuCar(new SportsCar(new LuxuCar(new BasicCar()))));
        c.assemble();
    }
}
