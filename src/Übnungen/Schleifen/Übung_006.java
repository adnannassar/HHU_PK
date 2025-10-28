package Übnungen.Schleifen;

import java.util.Scanner;

public class Übung_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen Zahl ein: ");
        int zahl = sc.nextInt();

        int teilerAnzahl = 0;
        for (int i = 1; i <= zahl; i++) {
            if (zahl % i == 0) {
                teilerAnzahl++;
            }
        }

        System.out.print(zahl + " hat " + teilerAnzahl + " Teiler! --> ");

        if (teilerAnzahl == 2) {
            System.out.println(zahl + " ist eine Primzahl!");
        } else {
            System.out.println(zahl + " ist keine Primzahl!");
        }

    }
}
