package ToString;

public class Car {
    String name;
    int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Max speed: " + maxSpeed + "kmh";
    }
}
