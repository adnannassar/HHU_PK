package Klausuren.Jahr_2024.HauptKlausur.Aufgabe_006;

import Datenstrukturen.BinarySearchTree.Node;

import java.util.ArrayList;

public class Bibliothek {
    private final LinkedList<Buch> buecher = new LinkedList<>();
    private final ArrayList<Buch>  buecher2 = new ArrayList<>();
    private int ausgelieheneBuecher = 0;

    public boolean ausleihen(String titel) {
        // Aufgabenteil b)
        if (ausgelieheneBuecher + 1 > buecher.size() / 2) {
            return false;
        }
        for (int i = 0; i < buecher.size(); i++) {
            Buch buch = buecher.get(i);
            if (buch.hatTitel(titel) && buch.ausleihbar()) {
                buch.ausleihen();
                ausgelieheneBuecher++;
                return true;
            }
        }
        return false;
    }

public LinkedList<Buch> alleBuecher() {
    return new LinkedList<>(buecher);
}

public void buchHinzufuegen(String titel) {
    buecher.add(new Buch(titel));
}
}
