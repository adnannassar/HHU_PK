package Comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto a, Auto b) {
        return a.getName().compareTo(b.getName());
    }
}
