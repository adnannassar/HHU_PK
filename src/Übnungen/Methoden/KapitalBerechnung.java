package Übnungen.Methoden;

import java.util.Scanner;

public class KapitalBerechnung {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte den Anlagebetrag eingeben: ");
        double anlagebetrag = scanner.nextDouble();

        System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
        int laufzeit = scanner.nextInt();

        int auswahl;
        do {

            System.out.println("-------------------------------------------");
            System.out.println("1. 1.5% Verzinsung ohne Bonuszahlung");
            System.out.println("2. 0.7% Verzinsung mit 15 Euro Bonuszahlung");
            System.out.println("3. 0.4% Verzinsung mit 20 Euro Bonuszahlung");
            System.out.println("4. 0.1% Verzinsung mit 50 Euro Bonuszahlung");
            System.out.println("5. Fertig");
            System.out.println("-------------------------------------------");

            System.out.print("Bitte eine Option auswahlen: ");
            auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    double kapital1 = berechneKapital(1.5, 0, anlagebetrag, laufzeit);
                    kapitalAusgaben(1.5, 0, anlagebetrag, laufzeit, kapital1);
                    break;
                case 2:
                    double kapital2 = berechneKapital(0.7, 15, anlagebetrag, laufzeit);
                    kapitalAusgaben(0.7, 15, anlagebetrag, laufzeit, kapital2);
                    break;
                case 3:
                    double kapital3 = berechneKapital(0.4, 20, anlagebetrag, laufzeit);
                    kapitalAusgaben(0.4, 20, anlagebetrag, laufzeit, kapital3);
                    break;
                case 4:
                    double kapital4 = berechneKapital(0.1, 50, anlagebetrag, laufzeit);
                    kapitalAusgaben(0.1, 50, anlagebetrag, laufzeit, kapital4);
                    break;
                case 5:
                    System.out.println("Fertig");
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine der Möglichkeiten 1-5 aus");
            }
        }
        while (auswahl != 5);
    }

    public static double berechneKapital(double verzinsung, int bonus, double anlagebetrag, int laufzeit) {
        double kapital = anlagebetrag * (laufzeit + (verzinsung / 100)) + bonus;
        return kapital;
    }

    public static void kapitalAusgaben(double verzinsung, int bonus, double anlagebetrag, int laufzeit, double kapital) {
        System.out.println("Kapital nach " + laufzeit + " Jahren für den Betrag (" + anlagebetrag + "€), Verzinsung (" + verzinsung + "%) und " + bonus + "€ Bonuszahlung ist " + kapital + "€");
    }
}


