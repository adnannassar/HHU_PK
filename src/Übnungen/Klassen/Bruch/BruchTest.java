package Übnungen.Klassen.Bruch;

public class BruchTest {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(); // 1/1
        System.out.println(b1);

        Bruch b2 = new Bruch(2, 3); // 2/3
        System.out.println(b2);

        Bruch b3 = b2.kehrWert();
        System.out.println(b3);

        Bruch b4 = b2.multiplizieren(b3);
        System.out.println(b4);

        Bruch b5 = b2.addieren(b3);
        System.out.println(b5);

        Bruch b6 = mul(b2, b4); // 2/3 * 6/6 = 12/18
        System.out.println(b6);


        Bruch b7 = new  Bruch(5, 2);
        Bruch b8 = new  Bruch(8, 3);
        Bruch b9 = mul(b7, b8);
        System.out.println(b9);
    }

    public static Bruch mul(Bruch a, Bruch b) {
        int neueZähler = a.getZähler() * b.getZähler();
        int neueNenner = a.getNenner() * b.getNenner();

        Bruch c = new Bruch(neueZähler, neueNenner);

        return c;
    }
}
