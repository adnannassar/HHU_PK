package Übnungen.Abstract.MitarbeiterVerwaltung;

public class Angestellter extends Mitarbeiter {
    private double grundgehalt;
    private double ortzuschlag;
    private double zulage;

    public Angestellter(String name, double grundgehalt, double ortzuschlag, double zulage) {
        super(name);
        this.grundgehalt = grundgehalt;
        this.ortzuschlag = ortzuschlag;
        this.zulage = zulage;
    }

    @Override
    public double berechneGehalt() {
        return grundgehalt + ortzuschlag + zulage;
    }
}
