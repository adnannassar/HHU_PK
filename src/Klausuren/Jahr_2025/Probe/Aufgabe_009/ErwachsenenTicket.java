package Klausuren.Jahr_2025.Probe.Aufgabe_009;

public class ErwachsenenTicket implements Ticket{
    @Override
    public int preis() {
        return 300;
    }

    @Override
    public String toString() {
        return "Erwachsenen Ticket, " + preis() + "€\n";
    }
}
