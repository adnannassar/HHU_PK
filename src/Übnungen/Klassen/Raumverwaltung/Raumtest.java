package Übnungen.Klassen.Raumverwaltung;

public class Raumtest {
    public static void main(String[] args) {
        Raumverwaltung raumverwaltung = new Raumverwaltung();

        Raum raum1 = new Raum('C', '2', "30");

        Raum raum2 = new Raum('C', '2', "40");
        Professor professor1 = new Professor("Konstantin Koll");
        raum2.setNutzer(professor1);

        Raum raum3 = new Raum('C', '2', "41");
        Professor professor2 = new Professor("Michael Stark");
        raum3.setNutzer(professor2);

        Raum raum4 = new Raum('A', '2', "02");
        Raum raum5 = new Raum('A', '2', "03");

        raumverwaltung.addRaum(raum1);
        raumverwaltung.addRaum(raum2);
        raumverwaltung.addRaum(raum3);
        raumverwaltung.addRaum(raum4);
        raumverwaltung.addRaum(raum5);

        raumverwaltung.ausgabeRaumliste();
    }
}
