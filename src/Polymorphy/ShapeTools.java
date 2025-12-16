package Polymorphy;

public class ShapeTools {
    public static void printShapeInfo(Shape s) {
        System.out.println("Name " + s.getName() + ", Color: " + s.getColor() + ", Fläche: " + s.berechneFläche());
    }
}
