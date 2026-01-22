package CollectionsFramework.Set.Allgeemein;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("z");
        set.add("b");

        System.out.println("SET: " + set);

        LinkedList<String> list = new LinkedList<String>();
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("z");
        list.add("b");

        System.out.println("LIST: " + list);


        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("z");
        treeSet.add("b");

        System.out.println("Tree Set: " + treeSet);

    }
}
