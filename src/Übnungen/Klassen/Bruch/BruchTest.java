package Übnungen.Klassen.Bruch;

public class BruchTest {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(); // 1/1
        System.out.println(b1.getZähler() + "/" + b1.getNenner());

        Bruch b2 = new Bruch(2, 3); // 2/3
        System.out.println(b2.getZähler() + "/" + b2.getNenner());

        Bruch b3 = b2.kehrWert();
        System.out.println(b3.getZähler() + "/" + b3.getNenner());

        Bruch b4 = b2.multiplizieren(b3);
        System.out.println(b4.getZähler() + "/" + b4.getNenner());

        Bruch b5 = b2.addieren(b3);
        System.out.println(b5.getZähler() + "/" + b5.getNenner());

        Bruch b6 = mul(b2, b4); // 2/3 * 6/6 = 12/18
        System.out.println(b6.getZähler() + "/" + b6.getNenner());


        Bruch b7 = new  Bruch(5, 2);
        Bruch b8 = new  Bruch(8, 3);
        Bruch b9 = mul(b7, b8);
        System.out.println(b9.getZähler() + "/" + b9.getNenner());
    }

    public static Bruch mul(Bruch a, Bruch b) {
        int neueZähler = a.getZähler() * b.getZähler();
        int neueNenner = a.getNenner() * b.getNenner();

        Bruch c = new Bruch(neueZähler, neueNenner);

        return c;
    }
}
