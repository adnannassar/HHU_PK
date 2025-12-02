package GlobalAndLocalVaiablen;

public class Main {
    int x = 10; // global

    public void test1() {
        int x = 20; // local
        int y = 25; // local
        System.out.println(x); // 20
        System.out.println(this.x); // 10

        System.out.println(y); // 25
    }

    public void test2() {
        int x = 30; // local
        int y = 35; // local

        System.out.println(x); // 30
        System.out.println(this.x); // 10
        System.out.println(y); // 35
    }
}