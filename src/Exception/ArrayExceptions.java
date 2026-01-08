package Exception;

public class ArrayExceptions {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("DANKE!");
    }
}
