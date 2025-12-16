package Polymorphy;


public class Main {
    public static void main(String[] args) {
        Shape sq = new Square("Square 1", "Red", 2);
        Shape rec = new Rectangle("Rectangle 1", "Yellow", 2, 4);
        Shape cr = new Circle("Circle 1", "Black", 1.5);
        Shape tr = new Triangle("Triangle 1", "White", 2, 3, 4);

        /*
        System.out.println("Fläche von Square: " + sq.berechneFläche());
        System.out.println("Fläche von Rectangle: " + rec.berechneFläche());
        System.out.println("Fläche von Circle: " + cr.berechneFläche());
        System.out.println("Fläche von Triangle: " + tr.berechneFläche());
        */

        ShapeTools.printShapeInfo(sq);
        ShapeTools.printShapeInfo(rec);
        ShapeTools.printShapeInfo(tr);
        ShapeTools.printShapeInfo(cr);
    }
}
