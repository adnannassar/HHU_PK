package Lampda.Calculator;

public class Calculator {
    public static void main(String[] args) {
        CalculateAction addAction = (int a, int b) -> a + b;
        System.out.println(addAction.calculate(4, 2));

        CalculateAction subAction = (int a, int b) -> a - b;
        System.out.println(subAction.calculate(4, 2));

        CalculateAction mulAction = (int a, int b) -> a * b;
        System.out.println(mulAction.calculate(4, 2));

        CalculateAction divAction = (int a, int b) -> a / b;
        System.out.println(divAction.calculate(4, 2));
    }
}
