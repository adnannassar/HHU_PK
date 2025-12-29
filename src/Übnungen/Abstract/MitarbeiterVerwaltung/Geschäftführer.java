package Übnungen.Abstract.MitarbeiterVerwaltung;

public class Geschäftführer extends Manager {
    private double zulage;

    public Geschäftführer(String name, double festgehalt, double provision, double zulage) {
        super(name, festgehalt, provision);
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return super.berechneGehalt() + zulage;
    }
}
