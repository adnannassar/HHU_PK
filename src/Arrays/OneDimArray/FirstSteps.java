package Arrays.OneDimArray;

public class FirstSteps {
    public static void main(String[] args) {
        // daten bekannt!
        int[] array = {10, 20, 30, 40, 50}; // {10, 20, 30, 40, 50}
        System.out.println("Array 1: ");
        System.out.println("Length of Array1 = " + array.length); // 5
        System.out.println("Value of index 0 in Array 1 = " + array[0]);
        array[4] = 100; // {10, 20, 30, 40, 100}
        System.out.println("Value of index 4 in Array 1 = " + array[4]);

        // daten unbekannt!
        int[] array2 = new int[5]; // {0, 0, 0, 0, 0}
        array2[0] = 15; // {15, 0, 0, 0, 0}
        array2[3] = -5; // {15, 0, 0, -5, 0}
        // array2[5] = 2; // {15, 0, 0, -5, 0} Exception! = Error!
        // array2[-1] = -5; // {15, 0, 0, -5, 0} Exception! = Error!

        System.out.println("\nArray 2: ");
        System.out.println("Length of Array2 = " + array2.length);
        System.out.println("Value of index 0 in Array 2 = " + array2[0]); // 15
        System.out.println("Value of index 3 in Array 2 = " + array2[3]); // -5
    }
}