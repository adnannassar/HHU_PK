package Übnungen.Methoden;

import java.util.Scanner;

public class Collatz2 {
    public static void main(String[] args) {
        // TODO do while schleife
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("1      Collatz-Folge für n");
        System.out.println("2      Länge der Collatz-Folge für n");
        System.out.println("3      Fertig");
        System.out.println("--------------------------------------------");

        System.out.print("Bitte etwas zwischen 1 und 3 eingeben: ");
        int zahl = sc.nextInt();

        if (zahl > 3 || zahl < 1) {
            System.out.println("--------------------------------------------");
            System.out.println("1      Collatz-Folge für n");
            System.out.println("2      Länge der Collatz-Folge für n");
            System.out.println("3      Fertig");
            System.out.println("--------------------------------------------");
            return;
        }
        if (zahl == 3) {
            System.out.println("Fertig!");
            return;
        }
        int n = sc.nextInt();

        if (zahl == 1) {
            berechneCollatzFolge(n);
        }
        if (zahl == 2) {
            berechneCollatzLaenge(n);
        }
    }


    static void berechneCollatzFolge(int n) {
        // Todo logic verbessern
        while (n != 1) {
            System.out.print(n + " --> ");
            if (n % 2 == 0)
                n = n / 2;
            else if (n % 3 == 0)
                n = n / 3;
            else
                n = 3 * n + 1;
        }
        System.out.println(1);
    }


    static void berechneCollatzLaenge(int n) {
        int laenge = 1;  // Startwert zählt als erstes Element
        int N = n;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = 3 * n + 1;
            }

            laenge++;  // EIN Schritt wurde gemacht
        }

        System.out.println(N + ": " + laenge);
    }
}

