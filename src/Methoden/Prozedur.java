package Methoden;

public class Prozedur {

    public static void main(String[] args) {
        add(10, 20); // aufruf der methode 10, 20 --> 30
        add(20, 30); // aufruf der methode 20, 30 --> 50
        add(30, 40); // aufruf der methode 30, 40 --> 70


        addIntAndDouble(10, 1.5); // aufruf der methode 10, 1.5 --> 11.5
        addDoubleAndDouble(1.5, 1.5); // aufruf der methode 1.5, 1.5 --> 3.0
    }

    static void add(int a, int b) {
        int result = a + b;
        System.out.println("Result of adding "+ a + " and " +  b+ " is "+ result);
    }

    static void addIntAndDouble(int a, double b) {
        double result = a + b;
        System.out.println("Result of adding "+ a + " and " +  b+ " is "+ result);
    }

    static void addDoubleAndDouble(double a, double b) {
        double result = a + b;
        System.out.println("Result of adding "+ a + " and " +  b+ " is "+ result);
    }
}
