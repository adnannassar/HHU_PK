package Schleifen;

public class DO_WhileLoop {
    public static void main(String[] args) {
        int i = 20;
        while (i <= 5) { // kopf gesteuerte Schleife!
            System.out.println(i);
            i++;
        }

        System.out.println("TEST");

        int x = 20;
        do {
            System.out.println(x);
            x++; // 21
        } while (x <= 5); // fuß gesteuerte Schleife!

        System.out.println("Nach!");
    }
}
