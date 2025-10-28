package Bedingungen;

import java.util.Scanner;

public class IF_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie die Note ein: ");

        float note = sc.nextFloat();

        if (note >= 1.0 && note <= 1.3) {
            System.out.println("Note: " + note + " --> A");
        } else if (note >= 1.7 && note <= 2.0) {
            System.out.println("Note: " + note + " --> B");
        } else if (note >= 2.3 && note <= 2.7) {
            System.out.println("Note: " + note + " --> C");
        } else if (note >= 3.0 && note <= 4.0) {
            System.out.println("Note: " + note + " --> D");
        } else {
            System.out.println("Note: " + note + " --> F");
        }
    }
}
