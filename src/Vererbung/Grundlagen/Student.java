package Vererbung.Grundlagen;

public class Student extends Person {
    private int matrikelnummer;
    public static int x;

    public Student(String name, int age, int matrikelnummer) {
        super(name, age);
        this.matrikelnummer = matrikelnummer;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String printInfo() {
        return "Student -> " + super.printInfo() + ", Matrikelnummer: " + matrikelnummer;
    }


    public static void test() {
        System.out.println("Test");
    }
}
