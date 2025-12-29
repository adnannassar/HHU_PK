package Übnungen.Abstract.BVB;

public class Arzt extends Mitglied {
    private String fachrichtung;

    public Arzt(String name, String vorname, String fachrichtung, char type) {
        super(name, vorname, type);
        this.fachrichtung = fachrichtung;
    }

    @Override
    public double berechneJahresgehalt() {
        return 12 * 10000;
    }

    @Override
    public String getSonstiges() {
        return "Fachrichtung: " + fachrichtung;
    }
}
