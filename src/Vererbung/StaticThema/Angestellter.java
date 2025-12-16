package Vererbung.StaticThema;

public class Angestellter {
    private String name;
    private int alter;
    private int id;
    private static int counter = 0;

    public Angestellter(String name, int alter) {
        this.name = name;
        this.alter = alter;
        counter++;
        id = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getId() {
        return id;
    }

    public String printInfo() {
        return "ID: " + id + ", Name: " + name + ", Alter: " + alter;
    }
}
