package Comparable;

public class SortArrayUsingComparable {

    public static void main(String[] args) {
        Auto a1 = new Auto("AUDI", 220);
        Auto a2 = new Auto("TESLA", 210);
        Auto a3 = new Auto("BMW", 230);

        Auto[] autos = {a1, a2, a3};
        System.out.println("Before Sort: ");
        printAutosArray(autos);

        insertionSort(autos);

        System.out.println("After  Sort: ");
        printAutosArray(autos);
    }

    //  T[] objects = {t1, t2, t3};
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > 0; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    T temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void printAutosArray(Auto[] autos) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] != null) {
                System.out.print(autos[i] + " ");
            }
        }
        System.out.println();
    }
}
