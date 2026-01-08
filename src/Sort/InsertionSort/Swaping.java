package Sort.InsertionSort;

public class Swaping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap --> a: " + a + ", b: " + b);
        int temp = a;
        a = b;
        b = temp; // swap

        System.out.println("After  swap --> a: " + a + ", b: " + b);


    }
}
