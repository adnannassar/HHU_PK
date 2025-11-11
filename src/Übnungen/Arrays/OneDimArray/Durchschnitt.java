package Übnungen.Arrays.OneDimArray;

public class Durchschnitt {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int durchschnitt = berechneDurchschnitt(a);
        int summ = summArray(a);

        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Summ: " + summ);

    }

    public static int berechneDurchschnitt(int[] a) {
        int summ = summArray(a);
        int durchschnitt = summ / a.length;
        return durchschnitt;
    }

    public static int summArray(int[] a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += a[i];
        }

        return summ;
    }
}
