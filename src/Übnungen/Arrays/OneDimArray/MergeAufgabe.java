package Übnungen.Arrays.OneDimArray;

public class MergeAufgabe {
    public static void main(String[] args) {
        // Annahme: a und b MÜSSEN aufsteigend sortiert werden
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 9};

        // int[] c = mergeMitAnnahme(a, b);
        int[] c = merge(a, b);
        printArray(c);

    }

    public static int[] mergeMitAnnahme(int[] a, int[] b) {
        // Annahme zweite Array is großer als erste Array
        // Beispiel: a {1,2,3}, b{4,5}
        // Rückgabe: c {1,2,3,4,5}

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0, j = a.length; i < b.length; i++, j++) {
            c[j] = b[i];
        }

        return c;
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // sobald in beiden Felder noch Elemente übrig gibt!
        while (i < a.length && j < b.length) {
            // wenn den Wert in a kleiner als den Wert in b
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            // wenn den Wert in b kleiner als den Wert in a
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }

        // Rest von a (falls noch etwas übrig gibt)
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Rest von b (falls noch etwas übrig gibt)
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
