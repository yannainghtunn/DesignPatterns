package dp.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final  long serialVersionUid=232323;
    private SerializedSingleton(){}
    private static class SingletonHelper {
        private static final SerializedSingleton instance=new SerializedSingleton();
    }
    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
    protected Object readResolve() {
        return getInstance();
    }
}
