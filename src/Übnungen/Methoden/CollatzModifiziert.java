package Übnungen.Methoden;

import java.util.Scanner;

public class CollatzModifiziert {

    static int berechneCollatzFolge(int a) {
        if(a == 1){
            return 1;
        }
        int wert;
            if (a % 2 == 0) {
                wert = a / 2;
            } else if (a % 2 == 1 && a % 3 == 0) {
                wert = a / 3;
            } else {
                wert = 3 * a + 1;
            }
            if(wert != 1) {
                System.out.print(wert + " -> ");
            } else
                System.out.print(wert);

        return berechneCollatzFolge(wert);
    }

    static int berechneCollazLaenge (int a){
        if(a == 1){
            return 1;
        }

        int wert;
        if (a % 2 == 0) {
            wert = a / 2;
        } else if (a % 2 == 1 && a % 3 == 0) {
            wert = a / 3;
        } else {
            wert = 3 * a + 1;
        }

        return 1 + berechneCollazLaenge(wert);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int auswahl;
        int n;
        int x;
        do{
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("1: Collatz-Folge für n");
            System.out.println("2: Länge der Collatz-Folge für n");
            System.out.println("3: Fertig");
            System.out.println("------------------------------");

            System.out.println("Bitte treffen sie eine auswahl zwischen 1 und 3 ");
            auswahl = sc.nextInt();

            switch(auswahl){
                case 1: System.out.println("Bitte geben sie eine Zahl die größer als 0 ist an ");
                    n = sc.nextInt();
                    System.out.print(n + " -> ");
                    berechneCollatzFolge(n);
                    break;
                case 2:System.out.println("Bitte geben sie eine Zahl die größer als 0 ist an ");
                    x = sc.nextInt();
                    int ergebnis = berechneCollazLaenge(x);
                    System.out.println(ergebnis);
                    break;
                case 3: System.out.println("Fertig!!");
                    break;
                default:
                    System.out.println("Bitte geben sie eine Zahl zwischen 1 und 3 ein");
            }

        } while(auswahl != 3);
    }
}
