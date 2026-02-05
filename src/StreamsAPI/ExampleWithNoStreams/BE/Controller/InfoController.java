package StreamsAPI.ExampleWithNoStreams.BE.Controller;

import StreamsAPI.ExampleWithNoStreams.BE.Entity.StudentInfoBackend;
import StreamsAPI.ExampleWithNoStreams.DB.Entitiy.DB_Student;
import StreamsAPI.ExampleWithNoStreams.DB.Data.DB_StudentDataMocks;

import java.util.LinkedList;
import java.util.List;

public class InfoController {
    public static List<StudentInfoBackend> getStudentsInfo() {
        List<DB_Student> dbStudentList = DB_StudentDataMocks.getAllStudents();
        List<StudentInfoBackend> erg = new LinkedList<>();

        for (DB_Student dbStudent : dbStudentList) {
            if (dbStudent != null) {
                StudentInfoBackend s = new StudentInfoBackend(dbStudent.getName(), dbStudent.getAlter(), dbStudent.getEmail(), dbStudent.getAdresse());
                erg.add(s);
            }
        }

        return erg;
    }
}
