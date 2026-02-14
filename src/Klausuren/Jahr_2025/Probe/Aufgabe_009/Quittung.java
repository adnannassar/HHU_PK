package Klausuren.Jahr_2025.Probe.Aufgabe_009;


import java.util.ArrayList;

public class Quittung {
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    private static Wetter wetter;
    private static int gesamtpreis;

    public Quittung(int anzahlErwachseneTickets, int anzahlKinderTickets, Wetter wetter) {
        this.wetter = wetter;
        for (int i = 0; i < anzahlErwachseneTickets; i++) {
            tickets.add(new ErwachsenenTicket());
        }

        for (int i = 0; i < anzahlKinderTickets; i++) {
            tickets.add(new KinderTicket());
        }
    }

    public int gesamtpreis() {
        for (int i = 0; i < tickets.size(); i++) {
            gesamtpreis += tickets.get(i).preis();
        }
        if (gesamtpreis > 1000 && wetter.temperatur() > 30) {
            return gesamtpreis - 200;
        } else {
            return gesamtpreis;
        }
    }

    @Override
    public String toString() {
        String erg = "";
        for (Ticket ticket : tickets) {
            erg += ticket.toString();
        }
        erg += "Gesamtpreis: " + gesamtpreis + "\n";
        return erg;
    }
}
