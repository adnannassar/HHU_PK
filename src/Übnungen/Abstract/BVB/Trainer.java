package Übnungen.Abstract.BVB;

public class Trainer extends Mitglied {
    private Spieler lieblingsspieler;

    public Trainer(String name, String vorname, char type) {
        super(name, vorname, type);
    }

    @Override
    public double berechneJahresgehalt() {
        return 12 * 165000;
    }

    @Override
    public String getSonstiges() {
        String erg = "Lieblingsspieler: ";
        if (lieblingsspieler != null) {
            return erg + lieblingsspieler.getVorname() + " " + lieblingsspieler.getName();
        } else {
            return erg + "-";
        }
    }

    public void setLieblingsspieler(Spieler lieblingsspieler) {
        this.lieblingsspieler = lieblingsspieler;
    }

    public Spieler getLieblingsspieler() {
        return lieblingsspieler;
    }
}
