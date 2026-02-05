package StreamsAPI.ExamplesOfStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        newWithStream();
    }

    public static void newWithStream() {
        Stream.of(new Student("Ammar", 20), new Student("Selim", 22))
                .map(s -> s.name)
                .forEach(s -> System.out.print(s + " "));
    }

    public static void oldWithNoStream() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ammar", 20));
        students.add(new Student("Selim", 22));
        System.out.println(students);

        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.name);
        }

        System.out.println(studentNames);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
