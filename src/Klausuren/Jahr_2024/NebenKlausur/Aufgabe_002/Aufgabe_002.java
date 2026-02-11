package Klausuren.Jahr_2024.NebenKlausur.Aufgabe_002;

public class Aufgabe_002 {
    public static void main(String[] args) {
        try {
            int[] erg = parse("[2;3,4]");
            System.out.print(erg[0] + ", " + erg[1] + ", " + erg[2]);
            double evaluateErg = evaluate(erg);
            System.out.println("\n"+ evaluateErg);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR!");
        }
    }

    // [2;3,4], [2;3,4,5,6], [2;3,4,5,6,7,8, .....]
    private static int[] parse(String kette) throws IllegalArgumentException {
        if (!kette.startsWith("[") || !kette.endsWith("]") || kette.length() < 3) {
            throw new IllegalArgumentException();
        } else {
            // klammern entfernen
            String ketteOhneKlammern = kette.substring(1, kette.length() - 1);
            // ; durch , ersetzen
            String ketteOhneSimiColom = ketteOhneKlammern.replace(";", ",");
            // string in einem String array umwandeln druch split (",")
            String[] ketteAlsStringArrayNurZalhen = ketteOhneSimiColom.split(",");
            // int array definieren um den mit den Werten aus dem String[] zu befüllen
            int[] ketteAlsIntegerArray = new int[ketteAlsStringArrayNurZalhen.length];
            // befüllen des Arrays
            for (int i = 0; i < ketteAlsStringArrayNurZalhen.length; i++) {
                try {
                    ketteAlsIntegerArray[i] = Integer.parseInt(ketteAlsStringArrayNurZalhen[i]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException();
                }
            }
            // rückgabe als int[]
            return ketteAlsIntegerArray;
        }

    }
    // [2,3,4].  --> 2.3125
    private static double evaluate(int[] number) {
        double erg = 1;
        for (int i = 0; i < number.length - 1; i++) {
            erg += number[i] + (1.0 / number[i + 1]);
        }
        return erg;
    }
}
