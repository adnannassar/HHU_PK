package Interfaces;

public class BKH extends Animal implements Cat {

    @Override
    public void meyw() {
        System.out.println("Meaaaaw");
    }

    public String getName() {
        return name;
    }
}
