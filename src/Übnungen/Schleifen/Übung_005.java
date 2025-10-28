package Übnungen.Schleifen;

import java.util.Scanner;

public class Übung_005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie einen Zahl ein: ");
        int zahl = sc.nextInt();

        int umgekehrteZahl = 0;
        while (zahl != 0) {
            int rest = zahl % 10;
            umgekehrteZahl = umgekehrteZahl * 10 + rest;
            zahl = zahl / 10;
        }

        System.out.println("Umgekehrte Zahl " + umgekehrteZahl);
    }
}
