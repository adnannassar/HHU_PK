package Übnungen.Klassen.Bruch;

public class Bruch {
    private int zähler;
    private int nenner;

    // default constructor
    public Bruch() {
        this.zähler = 1;
        this.nenner = 1;
    }

    public Bruch(int zähler, int nenner) {
        this.zähler = zähler;
        this.nenner = nenner;
    }

    public int getZähler() {
        return zähler;
    }

    public int getNenner() {
        return nenner;
    }

    public Bruch kehrWert() {
        return new Bruch(this.nenner, this.zähler);
    }

    public Bruch addieren(Bruch b) {
        int neuZähler = (this.zähler * b.nenner) + (this.nenner * b.zähler);
        int neuNenner = this.nenner * b.nenner;
        return new Bruch(neuZähler, neuNenner);
    }

    public Bruch multiplizieren(Bruch b) {
        int neuZähler = this.zähler * b.zähler;
        int neuNenner = this.nenner * b.nenner;
        Bruch c = new Bruch(neuZähler, neuNenner);
        return c;
    }

    // toString

}
