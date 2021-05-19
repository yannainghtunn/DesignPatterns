package dp.composite;

import java.util.LinkedList;

public class Div implements Node {
    LinkedList<Element> elements;
    Div() {
        elements=new LinkedList<>();
    }
    Div(LinkedList<Element> elements) {
        this.elements=elements;
    }
    public void add(Element e) {
        elements.add(e);
    }
    public void clear() {
        elements=new LinkedList<>();
    }
    @Override
    public void context() {
        for(Element e:elements) e.context();
    }
}
