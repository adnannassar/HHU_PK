package Übnungen.Abstract.MitarbeiterVerwaltung;

public class Arbeiter extends Mitarbeiter {
    private final double stundenlohn;
    private final double anzahlStunden;
    private final double überstundenzuschlag;
    private double anzahlÜberstunden;

    public Arbeiter(String name, double stundenlohn, double anzahlStunden, double überstundenzuschlag) {
        super(name);
        this.stundenlohn = stundenlohn;
        this.anzahlStunden = anzahlStunden;
        this.überstundenzuschlag = überstundenzuschlag;
    }

    public void setAnzahlÜberstunden(double anzahlÜberstunden) {
        this.anzahlÜberstunden = anzahlÜberstunden;
    }

    @Override
    public double berechneGehalt() {
        return (stundenlohn * anzahlStunden) + (überstundenzuschlag * anzahlÜberstunden);
    }
}
