package Advanced.EnhancedForLoop;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.print("Normal For Loop:   ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

        // For each!
        System.out.print("\nEnhanced For Loop: ");
        for (int ptr : values){
            System.out.print(ptr + " ");
        }
    }
}
