package Klausuren.Jahr_2025.Probe.Aufgabe_009;

public class Kassenautomat {
   public static void main(String[] args) {
        int geldGegeben = 3000 ;
        int anzahlErwachsene = 5; // 1500 + 750 = 2250
        int anzahlKinder = 5;


        Wetter w = new FakeWetter(31);
        Quittung q = new Quittung(anzahlErwachsene, anzahlKinder, w);

        if (geldGegeben >= q.gesamtpreis()) {
            System.out.println(q);
        }else{
            System.out.println("zu wenig Geld");
        }
    }
}
