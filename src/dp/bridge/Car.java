package dp.bridge;

public abstract class Car {
    Engine engine;
    Car(Engine engine) {
        this.engine=engine;
    }
    abstract void applyEngine();
}
