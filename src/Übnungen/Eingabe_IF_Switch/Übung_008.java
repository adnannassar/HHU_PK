package Übnungen.Eingabe_IF_Switch;

import java.util.Scanner;

public class Übung_008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte das Jahr eingeben: ");

        int jahr = scanner.nextInt();

        if (jahr % 4 == 0) {
            System.out.println(jahr + " ist ein Schaltjahr");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr");
        }
    }
}
