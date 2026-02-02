package PrintFormat;

public class Main {
    public static void main(String[] args) {
        float x = 10.5f;
        float y = 20.5f;
        int z = 30;
        System.out.println("X = " + x + ", Y = " + y + ", Z = " + z);

        System.out.printf("X = %f, Y = %f, Z = %d", x, y, z);
    }
}
