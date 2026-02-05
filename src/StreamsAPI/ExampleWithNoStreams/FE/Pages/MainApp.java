package StreamsAPI.ExampleWithNoStreams.FE.Pages;

import StreamsAPI.ExampleWithNoStreams.FE.Entity.StudentInfoFrontend;
import StreamsAPI.ExampleWithNoStreams.FE.Entity.StudentNoteFrontend;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // displayStudentInfoPage();
        displayNotePage();
    }

    private static void displayStudentInfoPage() {
        System.out.println("Student Info Page:");
        System.out.println(".....................");
        List<StudentInfoFrontend>  studentInfoFrontendList = StudentInfoPage.displayAllStudentInfo();
        for(StudentInfoFrontend studentInfoFrontend : studentInfoFrontendList){
            System.out.println(studentInfoFrontend);
        }
    }

    private static void displayNotePage() {
        System.out.println("Note Page:");
        System.out.println(".....................");
        List<StudentNoteFrontend>  studentInfoFrontendList = NotePage.displayAllNotes();
        for(StudentNoteFrontend studentNoteFrontend : studentInfoFrontendList){
            System.out.println(studentNoteFrontend);
        }
    }
}
