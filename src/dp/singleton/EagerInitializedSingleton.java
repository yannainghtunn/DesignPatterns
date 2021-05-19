package dp.singleton;

public class EagerInitializedSingleton {
    private EagerInitializedSingleton(){}
    private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}