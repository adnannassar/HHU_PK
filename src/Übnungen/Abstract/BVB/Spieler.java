package Übnungen.Abstract.BVB;

public class Spieler extends Mitglied {
    private String spielposition;
    private int speileinsätze;

    public Spieler(String name, String vorname, String spielposition, int speileinsätze, char type) {
        super(name, vorname, type);
        this.spielposition = spielposition;
        this.speileinsätze = speileinsätze;
    }

    @Override
    public double berechneJahresgehalt() {
        return 12 * 180000 + (5000 * speileinsätze);
    }

    @Override
    public String getSonstiges() {
        return "Postition: " + spielposition + " / Spieleinsätze: " + speileinsätze;
    }
}
