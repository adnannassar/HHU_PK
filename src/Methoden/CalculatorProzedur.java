package Methoden;

import java.util.Scanner;

public class CalculatorProzedur {
    static int num1;
    static int num2;
    static char operation;

    public static void main(String[] args) {
        readInput();
        calculate();
    }

    public static void readInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie die erste Zahl ein: ");
        num1 = sc.nextInt();

        // + - * / %
        System.out.print("Geben Sie eine Operation ein (+, -, *, /, %): ");
        operation = sc.next().charAt(0); // nur die erste eingabe Zeichen wird genommen

        System.out.print("Geben Sie die zweite Zahl ein: ");
        num2 = sc.nextInt();
    }

    public static void calculate() {
        switch(operation) {
            case '+':
                add(num1, num2);
                break;

            case '-':
                sub(num1, num2);
                break;

            case '*':
                mul(num1, num2);
                break;

            case '/':
                div(num1, num2);
                break;

            case '%':
                mod(num1, num2);
                break;

            default:
                System.out.println("Ungültige Operation!");
                break;
        }
    }

    public static void add(int a, int b) {
        System.out.println("Ergebnis: " + (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("Ergebnis: " + (a - b));
    }

    public static void mul(int a, int b) {
        System.out.println("Ergebnis: " + (a * b));
    }

    public static void div(int a, int b) {
        System.out.println("Ergebnis: " + (a / b));
    }

    public static void mod(int a, int b) {
        System.out.println("Ergebnis: " + (a % b));
    }
}
