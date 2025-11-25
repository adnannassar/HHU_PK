package WrapperKlasses;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = sc.next();

        System.out.println(Integer.parseInt(number) + 5);
    }
}
