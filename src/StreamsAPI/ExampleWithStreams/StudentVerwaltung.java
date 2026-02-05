package StreamsAPI.ExampleWithStreams;

import StreamsAPI.ExampleWithNoStreams.BE.Entity.StudentInfoBackend;

public class StudentVerwaltung {
    public static void main(String[] args) {
        DB_StudentDataMocks.getAllStudents()
                .stream()
                .map(student -> new StudentInfoBackend(student.getName(), student.getAlter(), student.getEmail(), student.getEmail()))
                .forEach(System.out::println);
    }

}
