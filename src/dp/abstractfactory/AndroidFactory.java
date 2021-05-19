package dp.abstractfactory;

public class AndroidFactory extends GUIFactory {
    @Override
    Button button() {
        return new AndroidButton();
    }
    @Override
    TextField textField() {
        return new AndroidTextField();
    }
}
