package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_007;

public class VoiceMail implements Message {
    private String message;

    public VoiceMail(String message) {
        this.message = message;
    }

    @Override
    public String speak() {
        return message;
    }
}
