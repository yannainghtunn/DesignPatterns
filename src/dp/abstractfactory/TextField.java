package dp.abstractfactory;

public abstract class TextField {
    String text;
    String getText() {
        return text;
    }
    void setText(String text) {
        this.text=text;
    }
    abstract void paint();
    public TextField() {
        paint();
    }
}
class AndroidTextField extends TextField{
    @Override
    void paint() {
        System.out.println("Painting AndroidTextField");
    }
}

class IOSTextField extends TextField{
    @Override
    void paint() {
        System.out.println("Painting IOSTextField");
    }
}

