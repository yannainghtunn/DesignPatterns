package dp.decorator;

public interface Car {
    void assemble();
}
class CarDecorator implements Car {
    Car car;
    CarDecorator(Car car) {
        this.car=car;
    }
    @Override
    public void assemble() {
        car.assemble();
    }
}
class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Feature adding...");
    }
}
class SportsCar extends CarDecorator {
    SportsCar(Car car) {
        super(car);
    }
    @Override
    public void assemble() {
        super.assemble();
        System.out.println("SportsCar Feature adding...");
    }
}
class LuxuCar extends CarDecorator {
    LuxuCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("LuxuCar Feature adding...");
    }
}