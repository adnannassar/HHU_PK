package Bedingungen;

public class Switch {
    public static void main(String[] args) {
        int x = 100;

        switch (x) {
            case 1:
                System.out.println("TOP");
                break;
            case 2:
                System.out.println("MITTLE");
                break;
            case 3:
                System.out.println("IN ORDNUNG");
                break;
            case 4:
                System.out.println("NICHT BESTANDEN!");
                break;
            default:
                System.out.println("Bitte eine gültige Value eingeben!");
        }
    }
}
