package CollectionsFramework.Set.HashCodeAndEquals;

import java.util.TreeSet;

public class TreeSetEinführung {
    public static void main(String[] args) {
        Student s1 = new Student("Ammar", 20, 12345, 3);
        Student s2 = new Student("Ammar", 20, 12345, 3);
        Student s3 = new Student("Nora", 22, 54321, 1);
        Student s4 = new Student("Ali", 25, 54321, 2);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println("TreeSet is sorted by name!");
        System.out.println(ts);
    }
}
