package Übnungen.Abstract.BVB;

import java.util.Scanner;

public class Mannschaft {
    private String name;
    private Mitglied[] mitglieder = new Mitglied[30];

    public Mannschaft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMitglied(Mitglied m) {
        for (int i = 0; i < mitglieder.length; i++) {
            if (mitglieder[i] == null) {
                mitglieder[i] = m;
                break;
            }
        }
    }


    private void printInfo() {
        System.out.println("\n----------------------------------------------------------------------------------------------------------------");
        System.out.println("Mannschaft: " + name + "\n");
        System.out.printf("%-10s%-20s%-20s%-20s%-20s\n", "Type", "Name", "Vorname", "Jahresgehalt", "Sonstiges");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        double summeJahresGehälter = 0;
        for (int i = 0; i < mitglieder.length; i++) {
            Mitglied m = mitglieder[i];
            if (mitglieder[i] != null) {
                System.out.printf("%-10s%-20s%-20s%-20.2f%-20s\n", m.getType(), m.getName(), m.getVorname(), m.berechneJahresgehalt(), m.getSonstiges());
                summeJahresGehälter += m.berechneJahresgehalt();
            }
        }
        System.out.printf("\nSummer der Jahresgehälter: %33.2f\n", summeJahresGehälter);
    }

    public void printMenu() {
        char eingabe;
        do {
            printInfo();
            System.out.println("\nWeitere Aktionen");
            System.out.println("\t(A)rzt hinzufügen");
            System.out.println("\t(S)pieler hinzufügen");
            System.out.println("\t(T)rainer hinzufügen");
            System.out.println("\t(B)eenden");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ihre Eingabe: ");
            eingabe = scanner.next().charAt(0);
            switch (eingabe) {
                case 'A':
                    addArzt();
                    break;

                case 'S':
                    addSpieler();
                    break;

                case 'T':
                    addTrainer();
                    break;

                case 'B':
                    System.out.println("Ciao");
                    break;

                default:
                    System.out.println("Bitte eine gültige Option eingeben!");
            }
        } while (eingabe != 'B');

    }

    private void addArzt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hinzufügen von Arzt...");

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Vorname: ");
        String vorname = scanner.next();

        System.out.print("Fachrichtung: ");
        String fachrichtung = scanner.next();

        System.out.print("Type: ");
        char type = scanner.next().charAt(0);


        Arzt arzt = new Arzt(name, vorname, fachrichtung, type);
        addMitglied(arzt);

    }

    private void addSpieler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hinzufügen von Spieler...");

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Vorname: ");
        String vorname = scanner.next();

        System.out.print("Spielposition: ");
        String spielposition = scanner.next();

        System.out.print("Spieleinsätze: ");
        int spieleinsätze = scanner.nextInt();

        System.out.print("Type: ");
        char type = scanner.next().charAt(0);


        Spieler spieler = new Spieler(name, vorname, spielposition, spieleinsätze, type);
        addMitglied(spieler);

    }

    private void addTrainer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hinzufügen von Trainer...");

        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Vorname: ");
        String vorname = scanner.next();

        System.out.print("Type: ");
        char type = scanner.next().charAt(0);

        System.out.print("Hat den Trainer " + name + " einen Lieblingsspieler? (J)a oder (N)ein: ");
        char jaNein = scanner.next().charAt(0);
        Spieler selectedSpieler;
        Trainer trainer = new Trainer(name, vorname, type);
        if (jaNein == 'J') {
            for (int i = 0; i < mitglieder.length; i++) {
                Mitglied m = mitglieder[i];
                if (m != null && m.getType() == 'S') {
                    System.out.println(m.getId() + " " + m.getVorname() + " " + m.getName());
                }
            }

            System.out.print("Bitte das ID des Lieblingsspielers eingeben: ");
            int selectedId = scanner.nextInt();
            for (int i = 0; i < mitglieder.length; i++) {
                Mitglied m = mitglieder[i];
                if (m != null && m.getType() == 'S' && m.getId() == selectedId) {
                    selectedSpieler = (Spieler) m;
                    trainer.setLieblingsspieler(selectedSpieler);
                }
            }
        }
        addMitglied(trainer);

    }
}
