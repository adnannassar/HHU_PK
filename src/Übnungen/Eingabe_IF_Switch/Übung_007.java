package Übnungen.Eingabe_IF_Switch;

import java.util.Scanner;

public class Übung_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte die erste NR eingeben: ");
        int nr1 = scanner.nextInt();

        System.out.print("Bitte die zweite NR eingeben: ");
        int nr2 = scanner.nextInt();

        System.out.print("Bitte die dritte NR eingeben: ");
        int nr3 = scanner.nextInt();


        if (nr1 > nr2 && nr1 > nr3) {
            System.out.println("Nr1 (" + nr1 + ") ist großer als die anderen Zahlen");
        } else if (nr2 > nr1 && nr2 > nr3) {
            System.out.println("Nr2 (" + nr2 + ") ist großer als die anderen Zahlen");
        } else {
            System.out.println("Nr3 (" + nr3 + ") großer als die anderen Zahlen");
        }

    }
}
