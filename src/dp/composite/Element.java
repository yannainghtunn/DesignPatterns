package dp.composite;

public class Element implements Node {
    String context;
    Element(String context) {
        this.context=context;
    }
    @Override
    public void context() {
        System.out.println(context);
    }
}
