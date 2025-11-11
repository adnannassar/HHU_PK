package Übnungen.Arrays.OneDimArray;

public class MaxAndMix {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int max = maxOfArray(a);
        int min = minOfArray(a);
        System.out.println("Max: " + max + ", Min: " + min);
    }



    public static int maxOfArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }


    public static int minOfArray(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
