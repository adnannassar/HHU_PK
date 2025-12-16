package Vererbung.StaticThema;

public class Main {
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Jack", 20, 2000.0); // id = 1
        Mitarbeiter m2 = new Mitarbeiter("Sebastian", 21, 1500.0); // id = 2

        Manager m3 = new Manager("Lauren", 22, 4000, 500); // id = 3

        System.out.println(m1.printInfo());
        System.out.println(m2.printInfo());
        System.out.println(m3.printInfo());
    }
}
