package Exception;


public class Main {
    public static void main(String[] args) {
        try {
            ExceptionExamples.div(1, 2);
        } catch (DivDurchNull e) {
            System.out.println("TEST");
        }
    }
}
