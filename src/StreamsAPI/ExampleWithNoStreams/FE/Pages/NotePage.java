package StreamsAPI.ExampleWithNoStreams.FE.Pages;

import StreamsAPI.ExampleWithNoStreams.BE.Controller.NoteController;
import StreamsAPI.ExampleWithNoStreams.BE.Entity.StudentNoteBackend;
import StreamsAPI.ExampleWithNoStreams.FE.Entity.StudentNoteFrontend;

import java.util.ArrayList;
import java.util.List;

public class NotePage {

    public static List<StudentNoteFrontend> displayAllNotes() {
        List<StudentNoteBackend> studentInfoBackendList = NoteController.getStudentsNotes();

        List<StudentNoteFrontend> studentNoteFrontend = new ArrayList<>();
        for (StudentNoteBackend sBE : studentInfoBackendList) {
            StudentNoteFrontend sFE = new StudentNoteFrontend(sBE.getName(), sBE.getNote());
            studentNoteFrontend.add(sFE);
        }

        return studentNoteFrontend;
    }
}
