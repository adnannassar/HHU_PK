package Vererbung.Grundlagen;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bashir", 25, 12345);

        Professor prof = new Professor("Muyassar", 23, "Informatik");

        Mitarbeiter mitarbeiter = new Mitarbeiter("Noora", 20, 5000.0);


        String studentInfo = student.printInfo();
        String profInfo = prof.printInfo();
        String mitarbeiterInfo = mitarbeiter.printInfo();

        System.out.println(studentInfo);
        System.out.println(profInfo);
        System.out.println(mitarbeiterInfo);


/*
        System.out.println("Student: " + student.getName() + ", " + student.getAge() + " Jahre alt, " + student.getMatrikelnummer());
        System.out.println("Professor: " + prof.getName() + ", " + prof.getAge() + " Jahre alt, " + prof.getFachbereich());
        System.out.println("Mitarbeiter: " + mitarbeiter.getName() + ", " + mitarbeiter.getAge() + " Jahre alt, " + mitarbeiter.getGehalt() + "€");

 */
    }
}
