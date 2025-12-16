package Polymorphy;

public class Square extends Shape {
    private int width;

    public Square(String name, String color, int width) {
        super(name, color);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double berechneFläche() {
        return width * width;
    }
}
