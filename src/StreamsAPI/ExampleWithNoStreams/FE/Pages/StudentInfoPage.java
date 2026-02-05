package StreamsAPI.ExampleWithNoStreams.FE.Pages;

import StreamsAPI.ExampleWithNoStreams.BE.Controller.InfoController;
import StreamsAPI.ExampleWithNoStreams.BE.Entity.StudentInfoBackend;
import StreamsAPI.ExampleWithNoStreams.FE.Entity.StudentInfoFrontend;

import java.util.ArrayList;
import java.util.List;

public class StudentInfoPage {
    public static List<StudentInfoFrontend> displayAllStudentInfo() {
        List<StudentInfoBackend> studentInfoBackendList = InfoController.getStudentsInfo();

        List<StudentInfoFrontend> studentInfoFrontendList = new ArrayList<>();
        for (StudentInfoBackend sBE : studentInfoBackendList) {
            StudentInfoFrontend sFE = new StudentInfoFrontend(sBE.getName(), sBE.getAlter(), sBE.getEmail(), sBE.getAdresse());
            studentInfoFrontendList.add(sFE);
        }

        return studentInfoFrontendList;
    }
}
