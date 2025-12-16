package Vererbung.StaticThema;

public class Mitarbeiter extends Angestellter {
    private double gehalt;

    public Mitarbeiter(String name, int alter, double gehalt) {
        super(name, alter);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String printInfo() {
        return "Mitarbeiter: " + super.printInfo() + ", Gehalt: " + gehalt + "€";
    }
}
