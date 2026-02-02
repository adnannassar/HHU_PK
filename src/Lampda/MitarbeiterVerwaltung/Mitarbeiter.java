package Lampda.MitarbeiterVerwaltung;

public class Mitarbeiter {
    private String name;
    private int alter;

    public Mitarbeiter(String name, int alter) {
        this.name = name;
        this.alter = alter;
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

    @Override
    public String toString() {
        return "Name: " + name + ", Alter: " + alter;
    }
}
