package dp.abstractfactory;

public abstract class Button {
    interface OnClick {
        void onClick();
    }
    OnClick onClick;
    void setOnClick(OnClick onClick) {
        this.onClick=onClick;
    }
    void click() {
        onClick.onClick();
    }
    abstract void paint();
    public Button() {
        paint();
    }
}

class AndroidButton extends Button {
    @Override
    void paint() {
        System.out.println("Painting AndroidButton");
    }
}
class IOSButton extends Button {
    @Override
    void paint() {
        System.out.println("Painting IOSButton");
    }
}
