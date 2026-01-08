package Exception;

import java.util.Scanner;

public class ExceptionExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NR1: ");
        int nr1 = scanner.nextInt();

        System.out.print("NR2: ");
        int nr2 = scanner.nextInt();

        try {
            System.out.println(nr1 / nr2);
        } catch (Exception e) {
            System.out.println("Nicht definiert!");
        }

        try {
            div(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Nicht definiert!");
        }

        System.out.println("HALLO");
    }

    public static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Nicht definiert!");
        }
        return a / b;
    }
}
