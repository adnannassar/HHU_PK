package Map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Student, List<Module>> stundentenNoten = new HashMap<>();

        stundentenNoten.put(
                new Student("Ammar", 111111),
                new LinkedList<Module>(Arrays.asList(new Module("Mathe", 1.0f), new Module("PK", 1.3f))));
        stundentenNoten.put(
                new Student("Nora", 222222),
                new ArrayList<>(Arrays.asList(new Module("Mathe", 1.3f), new Module("PK", 2.7f))));
        stundentenNoten.put(
                new Student("Nora", 222222),
                new LinkedList<Module>(Arrays.asList(new Module("Test", 2.3f), new Module("Test", 4.0f))));

        System.out.println("stundentenNoten: " + stundentenNoten);
    }
}

class Student {
    String name;
    int mtnr;

    public Student(String name, int mtnr) {
        this.name = name;
        this.mtnr = mtnr;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + mtnr + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mtnr == student.mtnr && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mtnr);
    }
}

class Module {
    String name;
    float note;

    public Module(String name, float note) {
        this.name = name;
        this.note = note;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + note + ")";
    }
}
