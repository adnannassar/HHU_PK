package Arrays.OneDimArray;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[5];

        fillArray(array);

        print(array);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 10;
        }
    }

    public static void print(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
