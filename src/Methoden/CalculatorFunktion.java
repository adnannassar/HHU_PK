package Methoden;

import java.util.Scanner;

public class CalculatorFunktion {
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
        switch (operation) {
            case '+':
                int addErg = add(num1, num2);
                System.out.println("Ergebnis: " + addErg);
                break;

            case '-':
                int subErg = sub(num1, num2);
                System.out.println("Ergebnis: " + subErg);
                break;

            case '*':
                int mulErg = mul(num1, num2);
                System.out.println("Ergebnis: " + mulErg);
                break;

            case '/':
                int divErg = div(num1, num2);
                System.out.println("Ergebnis: " + divErg);
                break;

            case '%':
                int modErg = mod(num1, num2);
                System.out.println("Ergebnis: " + modErg);
                break;

            default:
                System.out.println("Ungültige Operation!");
                break;
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
