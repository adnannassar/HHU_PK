package Lampda.MitarbeiterVerwaltung;

import java.util.Comparator;
import java.util.LinkedList;

public class MitarbeiterVerwaltung {
    private LinkedList<Mitarbeiter> mitarbeiterListe = new LinkedList<>();

    public void addMitarbeiter(Mitarbeiter mitarbeiter) {
        mitarbeiterListe.add(mitarbeiter);
    }

    public void sortByName() {
        Comparator<Mitarbeiter> xyz = (Mitarbeiter m1, Mitarbeiter m2) -> m1.getName().compareTo(m2.getName());
        mitarbeiterListe.sort(xyz);
    }

    public void sortByAlter() {
        mitarbeiterListe.sort((m1, m2) -> m1.getAlter() - m2.getAlter());
    }

    public void printAllMitarbeiter() {
        mitarbeiterListe.forEach((mitarbeiter) -> System.out.println(mitarbeiter));
    }

}
