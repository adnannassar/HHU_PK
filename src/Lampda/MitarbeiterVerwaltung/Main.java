package Lampda.MitarbeiterVerwaltung;

public class Main {
    public static void main(String[] args) {
        MitarbeiterVerwaltung mv = new MitarbeiterVerwaltung();
        mv.addMitarbeiter(new Mitarbeiter("Zakaria", 20));
        mv.addMitarbeiter(new Mitarbeiter("Ammar", 22));
        mv.addMitarbeiter(new Mitarbeiter("Nore", 19));
        mv.addMitarbeiter(new Mitarbeiter("Bashir", 18));

        mv.printAllMitarbeiter();

        mv.sortByName();

        System.out.println("\nAfter Sort By Name:");
        mv.printAllMitarbeiter();

    }
}
