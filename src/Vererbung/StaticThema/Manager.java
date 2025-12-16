package Vererbung.StaticThema;

public class Manager extends Angestellter {
    private double gehalt;
    private double bonus;

    public Manager(String name, int alter, double gehalt, double bonus) {
        super(name, alter);
        this.gehalt = gehalt;
        this.bonus = bonus;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String printInfo() {
        return "Manager: " + super.printInfo() + ", Gehalt: " + (gehalt + bonus) + "€";
    }
}
