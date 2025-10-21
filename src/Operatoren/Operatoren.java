package Operatoren;

public class Operatoren {
    public static void main(String[] args) {
        // arithmetische Operatoren (+, -, *, /, %)
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a % b;

        // ++ -- (inkrementieren, dekrementieren)
        int x = 10;

        // Post-increment
        System.out.println("Post increment: " + x++);  // x --> 10

        // Zwischen Zustand
        System.out.println("Zwischen Zustand: " + x); // x --> 11

        // Pre-increment
        System.out.println("Pre increment: " + ++x); // x -->  12

        // += -= *= /= %= (addieren, subtrahieren, multiplizieren, dividieren, modulo)
        x += 5; // x = x + 5 --> x = 17
        x -= 5; // x = x - 5 --> x = 12
        x *= 5; // x = x * 5 --> x = 60
        x /= 5; // x = x / 5 --> x = 12
        x %= 5; // x = x % 5 --> x = 2

        // Vergleichsoperatoren (==, !=, >, <, >=, <=)
        x = 10;

        boolean xIstGroßerZehn = (x != 10);
        System.out.println("x ist größer als 10: " + xIstGroßerZehn);

        // logische Operatoren (&&, ||, !)
        x = 15;                      //true  <--true && true
        boolean xIstZwischenZehnUndZwanzig = (x > 10 && x < 20);
        System.out.println("x ist zwischen 10 und 20: " + xIstZwischenZehnUndZwanzig);
        // x ist größer als 10 oder x ist kleiner als 20

                                        //true  <--true || false
        boolean xIstGroßerZehnOderKleinerNeun = (x > 10 || x < 9);
        System.out.println("x ist größer als 10 oder kleiner als 9: " + xIstGroßerZehnOderKleinerNeun);
    }
}
