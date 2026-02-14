package Klausuren.Jahr_2025.Probe.Aufgabe_003;

public class AlphabetGame {

    static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Es gibt keine Argumente");
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                String word1 = args[i];
                String word2 = args[i + 1];
                if (!validWord(word1) || !validWord(word2) || !isBefore(word1, word2)) {
                    System.out.println("ungültig");
                    return;
                }
            }
            System.out.println("gültig");
        }
    }

    private static boolean validWord(String word) {
        if (word.length() < 1) {
            return false;
        } else {
            char firstLetter = word.charAt(0);
            if ((firstLetter >= 'A' && firstLetter <= 'Z') ||
                    firstLetter == 'Ä' || firstLetter == 'Ö' ||
                    firstLetter == 'Ü'
            ) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static boolean isBefore(String str1, String str2) {
        if (str1.charAt(0) < str2.charAt(0)) {
            return true;
        } else {
            return false;
        }
    }
}
