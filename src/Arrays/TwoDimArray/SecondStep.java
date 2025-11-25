package Arrays.TwoDimArray;

public class SecondStep {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        // {
        //
        // {0,0,0,0,0}, i = 0
        // {0,0,0,0,0}, i = 1
        // {0,0,0,0,0}, i = 2
        // {0,0,0,0,0}, i = 3
        // {0,0,0,0,0}  i = 4
        // }

        System.out.println("Before fill: ");
        printArray(array);

        fillArrayFromOneToLength(array);

        System.out.println("After fill:  ");
        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillArrayFromOneToLength(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j + 1;
            }
        }
    }
}
