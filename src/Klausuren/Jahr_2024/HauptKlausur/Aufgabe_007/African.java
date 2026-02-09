package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_007;

public class African extends Parrot {
    private int kokosnuessen;

    public African(Message message, int kokosnuessen) throws IllegalArgumentException {
        super(message);
        if (kokosnuessen < 0) {
            throw new IllegalArgumentException("kokosnuessen muss goßer 0 sein!");
        } else {
            this.kokosnuessen = kokosnuessen;
        }
    }

    @Override
    public double getSpeed() {
        return Math.max(0, (12 - 9 * kokosnuessen));
    }
}
