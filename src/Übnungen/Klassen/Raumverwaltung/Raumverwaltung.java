package Übnungen.Klassen.Raumverwaltung;

public class Raumverwaltung {
    private Raum[] räume = new Raum[5]; // null

    public Raumverwaltung() {
    }

    public void addRaum(Raum raum) {
        for (int i = 0; i < räume.length; i++) {
            // ist die Stelle leer?
            if (räume[i] == null) {
                räume[i] = raum;
                break;
            }
        }
    }

    public void ausgabeRaumliste() {
        for (int i = 0; i < räume.length; i++) {
            // ist die Stelle belegt?
            if (räume[i] != null) {
                System.out.print(räume[i].getTrakt() + "." + räume[i].getEtage() + "." + räume[i].getNummer());
                // hat der Raum einen Nutzer?
                if (räume[i].getNutzer() != null) {
                    System.out.print(": " + räume[i].getNutzer().getName());
                }
            }
            System.out.println();
        }
    }
}
