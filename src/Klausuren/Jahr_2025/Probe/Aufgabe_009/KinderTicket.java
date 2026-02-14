package Klausuren.Jahr_2025.Probe.Aufgabe_009;

public class KinderTicket implements Ticket {
    @Override
    public int preis() {
        return 150;
    }

    @Override
    public String toString() {
        return "Kinder Ticket, " + preis() + "€\n";
    }
}
