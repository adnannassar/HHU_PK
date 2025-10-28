package Einagbe;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie den Alter ein: ");

        int alter = sc.nextInt();

        if(alter > 20 || alter < 30) {
            System.out.println("Du bist noch Jung!");
        }

        System.out.println("Du bist " + alter  + " Jahre alt");
    }

}
