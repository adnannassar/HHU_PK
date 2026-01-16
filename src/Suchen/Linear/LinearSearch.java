package Suchen.Linear;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 3)); // true
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 6)); // false
    }

    public static boolean search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
