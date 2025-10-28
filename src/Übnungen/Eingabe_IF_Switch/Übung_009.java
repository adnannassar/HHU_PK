package Übnungen.Eingabe_IF_Switch;

import java.util.Scanner;

public class Übung_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String savedName = "Admin";
        String savedPassword = "12345";

        boolean nameIsKorrekt = false;
        do {
            System.out.print("Bitte den Namen eingeben: ");
            String eingabeName = scanner.next();
            if (eingabeName.equals(savedName)) {
                nameIsKorrekt = true;
            } else {
                System.out.println("Name ist falsch! bitte erneut eingeben!");
            }
        } while (!nameIsKorrekt);


        boolean passwordIsKorrekt = false;
        do {
            System.out.print("Bitte den Passwort eingeben: ");
            String eingabePassword = scanner.next();
            if (eingabePassword.equals(savedPassword)) {
                passwordIsKorrekt = true;
            } else {
                System.out.println("Passwort ist falsch! bitte erneut eingeben!");
            }
        } while (!passwordIsKorrekt);

        if (nameIsKorrekt && passwordIsKorrekt) {
            System.out.println("Du bist eingeloggt!");
        }
    }
}
