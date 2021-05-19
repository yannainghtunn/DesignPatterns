package dp.factory;

public class ShapeFactory {
    public static Shape getShape(String name) {
        if(name.equalsIgnoreCase("circle")) return new CircleShape();
        else if(name.equalsIgnoreCase("rectangle")) return  new Rectangle();
        return null;
    }
}
