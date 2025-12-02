package Übnungen.Klassen;

public class DozentTest {
    public static void main(String[] args) {
        // Deklaration
        Dozent dieDozentin;
        Dozent derDekan;


        // initialize, erzeugung
        dieDozentin = new Dozent("Laura Müller", "Informatik", 'W');

        derDekan = new Dozent("Thomas Müller", "Mathematik", 'M');
        derDekan.setDekan(true);

        printDozentInfo(derDekan);

        dieDozentin.setLehrgebiet("Wirtschaft");
        printDozentInfo(dieDozentin);


    }

    // hilf methode!
    public static void printDozentInfo(Dozent dozent) {
        String dekanStatus_dozentin;
        if (dozent.isDekan()) {
            dekanStatus_dozentin = "Ja";
        } else {
            dekanStatus_dozentin = "Nein";
        }
        System.out.println("\nDozent: " + dozent.getName() + ", " + dozent.getGeschlecht()
                + ", " + dozent.getLehrgebiet() + " , Is Dozent ein Dekan? " + dekanStatus_dozentin);
    }
}
