package Arrays.TwoDimArray;

public class FirstSteps {
    public static void main(String[] args) {
        // daten bekannt!
        int[][] array = {
                {10, 20},
                {30, 40},
                {50, 60}
        };
        System.out.println("Array 1: ");
        System.out.println("Length of Array1 = " + array.length); // 3
        System.out.println("Length of the first line of Array1 = " + array[0].length); // 2
        System.out.println("Value of index [1,1] in Array 1 = " + array[1][1]);
        array[2][1] = 100;
        System.out.println("Value of index [2,1] in Array 1 = " + array[2][1]); // 100

        // daten unbekannt!
        int[][] array2 = new int[3][2]; // {
        // {0,0},
        // {0,0},
        // {0,0} }
        array2[0][0] = 15; // { {15,0}, {0,0}, {0,0} }
        array2[2][0] = -5; // { {15,0}, {0,0}, {-5,0} }

        System.out.println("\nArray 2: ");
        System.out.println("Length of Array2 = " + array2.length);
        System.out.println("Value of index [0,0] in Array 2 = " + array2[0][0]); // 15
        System.out.println("Value of index [2,0] in Array 2 = " + array2[2][0]); // -5
    }
}