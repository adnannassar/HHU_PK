package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_006;

public class Buch {
    private final String titel;
    private boolean ausgeliehen = false;
    public Buch(String titel) {
        this.titel = titel;
    }
    public void ausleihen() {
        if(!ausgeliehen) {
            ausgeliehen = true;
        }
    }
    public void zurueckgeben() {
        ausgeliehen = false;
    }
    public boolean ausleihbar() {
        return !ausgeliehen;
    }
    public boolean hatTitel(String titel) {
        return this.titel.equals(titel);
    }
}