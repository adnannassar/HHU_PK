public class Test {
    public static void main(String[] args) {
        printName(new Student("Ammar", 20).getName());
    }

    public static void printName(String studentName){
        System.out.println(studentName);
    }

}

class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
