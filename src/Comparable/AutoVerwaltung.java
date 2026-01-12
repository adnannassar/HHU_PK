package Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class AutoVerwaltung {
    LinkedList<Auto> list = new LinkedList<>();


    public void addAuto(Auto auto) {
        list.add(auto);

        // sorting
        // list.sort(new SpeedComparator());
        // list.sort(new NameComparator());
        Collections.sort(list); // using Comparable --> sort nach speed in class Auto difiniert
        // Collections.sort(list, new SpeedComparator()); //using Comparator sort nach speed
        // Collections.sort(list, new NameComparator()); //using Comparator sort nach name
    }

    public void printAutoInfos() {
        System.out.println(list);
    }
}
