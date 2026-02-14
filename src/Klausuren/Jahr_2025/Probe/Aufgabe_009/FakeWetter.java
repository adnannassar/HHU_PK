package Klausuren.Jahr_2025.Probe.Aufgabe_009;

public class FakeWetter implements Wetter {
    private double temperatur;

    public FakeWetter(double temperatur) {
        this.temperatur = temperatur;
    }

    @Override
    public double temperatur() {
        return temperatur;
    }
}
