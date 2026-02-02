package Lampda.BasicExample;

public class Main {
    public static void main(String[] args) {
        // actions
        Greeter germanAction = () -> System.out.println("Hallo Welt");
        Greeter englishAction = () -> System.out.println("Hello World");
        Greeter italianAction = () -> System.out.println("Ciao mondo");

        greet(germanAction);
        greet(englishAction);
        greet(italianAction);
    }

    public static void greet(Greeter greeter) {
        greeter.action();
    }
}