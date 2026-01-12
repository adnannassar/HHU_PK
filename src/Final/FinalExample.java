package Final;

// die class FinalExample ist als final markiert --> von FinalExample
// kann nicht vererbt werden!
public final class FinalExample {
    public static void main(String[] args) {
        final int x = 15; // read only!
        // x  = x + 5; // falsch!
        // x++; // falsch
        // x = 20 // falsch
    }

    // die methode doTest is als final --> die Methode kann in unterklassen
    // von FinalExample (wenn es gibt) nicht überschrieben werden! (keine @Override) möglich
    public final void doTest() {
        System.out.println("Hallo!");
    }
}