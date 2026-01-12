package Comparable;

public class Auto implements Comparable<Auto> {
    private String name;
    private int speed;

    public Auto(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "(" + name + "-" + speed + "kmh)";
    }

    @Override
    public int compareTo(Auto a) {
        return this.getSpeed() - a.getSpeed();
    }
}
