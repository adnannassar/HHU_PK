package Overloading;

public class Mian {

    public static void main(String[] args) {
        add(1, 2.5f);
        add(2.5f, 1);
    }

    // overloading, überladen
    public static float add(int a, float b) {
        return a + b;
    }

    public static float add(float b, int a) {
        return a + b;
    }

}
