package Comparable;

public class Main {
    public static void main(String[] args) {
        AutoVerwaltung autoVerwaltung = new AutoVerwaltung();

        autoVerwaltung.addAuto(new Auto("AUDI", 220));
        autoVerwaltung.addAuto(new Auto("TESLA", 210));
        autoVerwaltung.addAuto(new Auto("BMW", 230));

        autoVerwaltung.printAutoInfos();
    }
}
