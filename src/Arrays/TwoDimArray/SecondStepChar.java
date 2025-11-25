package Arrays.TwoDimArray;

public class SecondStepChar {
    public static void main(String[] args) {
        char[][] array = new char[5][5];
        // {
        //
        // { , , , , }, i = 0
        // { , , , , }, i = 1
        // { , , , , }, i = 2
        // { , , , , }, i = 3
        // { , , , , }  i = 4
        // }

        System.out.println("Before fill: ");
        printArray(array);

        fillArrayFromOneToLength(array);

        System.out.println("After fill:  ");
        printArray(array);
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void fillArrayFromOneToLength(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '.';
            }
        }
    }
}
