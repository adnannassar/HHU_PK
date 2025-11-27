package Klasses;

public class Main {
    public static void main(String[] args) {
        Adresse a1 = new Adresse("Test", "1", "12345", "Dortmund", "Deutschland");

        Student s1 = new Student("Ammer", 50, 123456789, a1);

        System.out.println();
        System.out.println(s1.getName());
        System.out.println(s1.getAlter());
        System.out.println(s1.getMatrikelnummer());

        s1.setName("Ammar");
        s1.setAlter(25);


        System.out.println();
        System.out.println(s1.getName());
        System.out.println(s1.getAlter());
        System.out.println(s1.getMatrikelnummer());

        Adresse a2 = new Adresse("Test2", "2", "54321", "Roma", "Italy");

        Student s2 = new Student("Noor", 22, 98765421, a2);

        System.out.println();

        printStudent(s1);
        printStudent(s2);

    }

    public static void printStudent(Student s1) {
        s1.sichVorstellen();
    }


}
