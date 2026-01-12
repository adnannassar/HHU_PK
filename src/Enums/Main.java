package Enums;

import Records.Address;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nora", 20, Geschlecht.Weiblich);

        Person p2 = new Person("Zakrya", 22, Geschlecht.Männlich);

        System.out.println(p1);
        System.out.println(p2);
    }
}
