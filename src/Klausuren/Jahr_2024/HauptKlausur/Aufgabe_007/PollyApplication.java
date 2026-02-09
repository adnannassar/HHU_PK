package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_007;

public class PollyApplication {
    public static void main(String[] args) {
        VoiceMail voiceMail = new VoiceMail("Foo999");
        African african = new African(voiceMail, 1);
        System.out.println(african.getSpeed());
        african.read();

    }
}
