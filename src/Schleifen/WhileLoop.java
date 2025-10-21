package Schleifen;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        int i = 1;
        boolean ist5Erreicht = false;
        while (!ist5Erreicht) {
            System.out.println(i);
            i++;

            if (i == 6) {
                ist5Erreicht = true;
            }
        }
    }
}
