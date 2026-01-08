package Recurcive;


public class Recursive {
    public static void main(String[] args) {
        System.out.println("Recursive: " + fakRecursive(4));
        System.out.println("Iterative: " + fakIterative(4));
    }

    public static int fakRecursive(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fakRecursive(n - 1);
        }
    }

    public static int fakIterative(int n) {
        int erg = 1;
        for (int i = 1; i <= n; i++) {
            erg *= i;
        }
        return erg;
    }
}
