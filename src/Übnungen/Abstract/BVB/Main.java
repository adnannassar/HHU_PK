package Übnungen.Abstract.BVB;

public class Main {
    public static void main(String[] args) {
        Spieler speiler1 = new Spieler("Götze", "Mario", "Mittelfeld", 5, 'S');
        Spieler speiler2 = new Spieler("Aubameyang", "Pierre-Emerik", "Sturm", 18, 'S');

        Trainer trainer = new Trainer("Tuchel", "Thomas", 'T');
        trainer.setLieblingsspieler(speiler2);

        Arzt arzt = new Arzt("Braun", "Markus", "Orthopädie", 'A');

        Mannschaft mannschaft = new Mannschaft("Ball-Verein Borussia Dortmund 09");
        mannschaft.addMitglied(speiler1);
        mannschaft.addMitglied(speiler2);
        mannschaft.addMitglied(trainer);
        mannschaft.addMitglied(arzt);

        mannschaft.printMenu();


    }
}
