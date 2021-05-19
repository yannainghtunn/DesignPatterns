package dp.abstractfactory;

public class Main {
    public static void main(String... args) {
        Application application=new Application(new AndroidFactory());
    }
}
class Application {
    Button button;
    TextField textField;
    Application(GUIFactory factory) {
        button=factory.button();
        textField=factory.textField();
    }
}
