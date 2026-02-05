package StreamsAPI.ExampleWithNoStreams.DB.Data;

import StreamsAPI.ExampleWithNoStreams.DB.Entitiy.DB_Student;

import java.util.ArrayList;
import java.util.List;

public class DB_StudentDataMocks {
    public static List<DB_Student> getAllStudents() {
        List<DB_Student> students = new ArrayList<>();
        students.add(new DB_Student("Ammar", 20, "ammar@gmail.com", "Teststr 4, 22134 Berlin", 1));
        students.add(new DB_Student("Sara", 22, "sara.khan@gmail.com", "Hauptstr 12, 10115 Berlin", 2));
        students.add(new DB_Student("John", 19, "john.doe@gmail.com", "Bahnhofstr 8, 80331 München", 3));
        students.add(new DB_Student("Lina", 21, "lina.schmidt@gmail.com", "Königstr 45, 70173 Stuttgart", 4));
        students.add(new DB_Student("Ali", 23, "ali.hassan@gmail.com", "Marktplatz 3, 50667 Köln", 5));
        students.add(new DB_Student("Emma", 20, "emma.wagner@gmail.com", "Friedrichstr 99, 40217 Düsseldorf", 6));
        students.add(new DB_Student("Noah", 24, "noah.meier@gmail.com", "Lange Str 15, 28195 Bremen", 7));
        students.add(new DB_Student("Maya", 18, "maya.ibrahim@gmail.com", "Goethestr 7, 04109 Leipzig", 8));

        return students;
    }
}
