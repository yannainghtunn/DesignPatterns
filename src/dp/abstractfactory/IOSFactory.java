package dp.abstractfactory;

public class IOSFactory extends GUIFactory {
    @Override
    Button button() {
        return new IOSButton();
    }
    @Override
    TextField textField() {
        return new IOSTextField();
    }
}
