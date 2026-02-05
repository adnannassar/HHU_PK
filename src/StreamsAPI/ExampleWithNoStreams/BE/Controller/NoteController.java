package StreamsAPI.ExampleWithNoStreams.BE.Controller;

import StreamsAPI.ExampleWithNoStreams.BE.Entity.StudentInfoBackend;
import StreamsAPI.ExampleWithNoStreams.BE.Entity.StudentNoteBackend;
import StreamsAPI.ExampleWithNoStreams.DB.Data.DB_StudentDataMocks;
import StreamsAPI.ExampleWithNoStreams.DB.Entitiy.DB_Student;

import java.util.LinkedList;
import java.util.List;

public class NoteController {

    public static List<StudentNoteBackend> getStudentsNotes() {
        List<DB_Student> dbStudentList = DB_StudentDataMocks.getAllStudents();
        List<StudentNoteBackend> erg = new LinkedList<>();

        for (DB_Student dbStudent : dbStudentList) {
            if (dbStudent != null) {
                StudentNoteBackend s = new StudentNoteBackend(dbStudent.getName(),dbStudent.getNote());
                erg.add(s);
            }
        }

        return erg;
    }
}
