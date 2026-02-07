package Klausuren.Jahr_2024.HauptKlausur.Aufagbe_004;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("err7999");
        } else {
            String firstArgument = args[0];
            if (isValidInput(firstArgument)) {
                System.out.println(atbash(firstArgument));
            } else {
                System.out.println("err7999");
            }
        }
    }

    // true when uppercase!
    private static boolean isValidInput(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) < 65 || n.charAt(i) > 90) {
                return false;
            }
        }
        return true;
    }

    private static String atbash(String n) {
        String verschluesselterText = "";

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                verschluesselterText += (char) ('Z' - (c - 'A'));
            }
        }
        return verschluesselterText;
    }
}
