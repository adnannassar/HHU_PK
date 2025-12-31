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

        dieDozentin.setLehrgebiet("Wirtschaft");

        System.out.println(derDekan);
        System.out.println(dieDozentin);
    }
}
