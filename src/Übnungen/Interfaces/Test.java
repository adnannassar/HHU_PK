package Übnungen.Interfaces;

public class Test {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone(0, "015751231231", 6.0);
        Smartphone s2 = new Smartphone(1, "015781295611", 5.8);


        s1.addSMS(1000, "Hallo, wie geht's dir?");
        s1.addSMS(1000, "Kommst du heute zum Kurs?");

        s2.addSMS(2000, "Hi, mir geht's gut. Ich würde heute dabei sein!");

        System.out.println(s1);
        System.out.println();
        System.out.println(s2);
    }
}