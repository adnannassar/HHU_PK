package Comparable;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto a, Auto b) {
        return a.getSpeed() - b.getSpeed();
    }
}
