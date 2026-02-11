package Klausuren.Jahr_2024.NebenKlausur.Aufageb_005;

public class Main {
    public static void main(String[] args) {
        int[][] werte1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] werte2 = {{10, 20}, {30, 40}, {50, 60}};

        Matrix m1 = new Matrix(werte1);
        Matrix m2 = new Matrix(werte2);

        Matrix m3 = m1.multiply(m2);


        System.out.println("a:");
        System.out.println(m1);

        System.out.println("\nb:");
        System.out.println(m2);

        System.out.println("\nc:");
        System.out.println(m3);

        werte1[1] = new int[] {0};

        System.out.println("a:");
        System.out.println(m1);


        System.out.println("\nb:");
        System.out.println(m2);
    }
}
