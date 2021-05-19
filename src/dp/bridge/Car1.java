package dp.bridge;

public class Car1 extends Car {
    Car1(Engine engine) {
        super(engine);
    }
    @Override
    void applyEngine() {
        System.out.println("Car1 Engine Applying.....");
        engine.applyEngine(this);
    }
}
/*
    Animal
        Bird - fly
        Duck - fly,swim,walk
        Dog  - walk,swim
        Fish - swim
        Cat  - walk

    Methods
        Fly,Swim,Walk
 */
