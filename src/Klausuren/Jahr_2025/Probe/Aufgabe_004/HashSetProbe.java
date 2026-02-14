package Klausuren.Jahr_2025.Probe.Aufgabe_004;

import java.util.function.Predicate;

public class HashSetProbe {
    private final static int SIZE = 50;
    private Studi[] studis = new Studi[SIZE];


    public int countIf(Predicate<String> p) {
        int count = 0;
        for (int i = 0; i < studis.length; i++) {
            if (p.test(studis[i].name())) {
                count++;
            }
        }
        return count;
    }

}
