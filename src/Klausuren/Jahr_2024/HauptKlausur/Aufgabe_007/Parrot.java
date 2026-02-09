package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_007;

public abstract class Parrot {

    private Message message;

    public Parrot(Message message) {
        this.message = message;
    }

    public void read() {
        System.out.println("Nachricht lauter: " + message.speak());
    }

    public abstract double getSpeed();
}
