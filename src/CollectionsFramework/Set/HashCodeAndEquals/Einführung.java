package CollectionsFramework.Set.HashCodeAndEquals;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Einführung {
    public static void main(String[] args) {
        Student s1 = new Student("Ammar", 20, 12345, 4);
        Student s2 = new Student("Ammar", 20, 12345, 1);
        Student s3 = new Student("Nora", 22, 54321, 2);
        Student s4 = new Student("Ali", 25, 54321, 3);

        System.out.println("S1 --> " + s1 + ", " + s1.hashCode());
        System.out.println("S2 --> " + s2 + ", " + s2.hashCode());
        System.out.println("S3 --> " + s3 + ", " + s3.hashCode());
        System.out.println("S4 --> " + s4 + ", " + s4.hashCode());

        if (s1.equals(s2)) {
            System.out.println("S1 == S2");
        } else {
            System.out.println("S1 != S2");
        }

        LinkedHashSet<Student> set = new LinkedHashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println("Set: " + set);
    }
}