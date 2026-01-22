package CollectionsFramework.List;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println(arrayList.size()); // 0
        System.out.println(arrayList.isEmpty()); // true

        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(1, 1);

        System.out.println(arrayList);
        System.out.println(arrayList.size()); // 4
        System.out.println(arrayList.isEmpty()); // false
        System.out.println(arrayList.contains(1)); // true
        System.out.println(arrayList.contains(10)); // false
    }
}
