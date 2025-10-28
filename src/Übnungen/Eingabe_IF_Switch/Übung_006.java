package Übnungen.Eingabe_IF_Switch;

import java.util.Scanner;

public class Übung_006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte den Monat eingeben: ");
        String eingabeMonat = scanner.next();

        switch (eingabeMonat) {
            case "November", "Dezember", "Januar", "Februar":
                System.out.println("Winter");
                break;
            case "März", "April", "Mai":
                System.out.println("Frühling");
                break;
            case "Juni", "Juli", "August":
                System.out.println("Sommer");
                break;
            case "September", "Oktober":
                System.out.println("Herbst");
                break;
            default:
                System.out.println("Bitte ein gültigen Monat eingeben!");
        }
    }
}
