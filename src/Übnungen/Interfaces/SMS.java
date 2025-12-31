package Übnungen.Interfaces;

public class SMS {
    private int empfaengerId;
    private String text;

    public SMS(int empfaengerId, String text) {
        this.empfaengerId = empfaengerId;
        this.text = text;
    }

    public int getEmpfaengerId() {
        return empfaengerId;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Empfaenger ID: " + empfaengerId + ", Text: " + text;
    }
}