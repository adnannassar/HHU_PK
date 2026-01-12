package Records;

public class Main {
    public static void main(String[] args) {
        Address a = new Address("Teststr.", 1, 22211, "Dortmund");

        // die methode strasse() ist als getter von java automatisch implementiert!
        System.out.println(a.strasse());

        // die methode hausnummmer() ist als getter von java automatisch implementiert!
        System.out.println(a.hausnummmer());

        // die methode plz() ist als getter von java automatisch implementiert!
        System.out.println(a.plz());

        // die methode land() ist als getter von java automatisch implementiert!
        System.out.println(a.land());
    }
}
