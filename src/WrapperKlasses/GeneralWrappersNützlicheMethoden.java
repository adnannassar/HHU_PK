package WrapperKlasses;

public class GeneralWrappersNützlicheMethoden {
    public static void main(String[] args) {
        // Integer, Double, Character, Boolean
        System.out.println("ParseInt");
        String xAsString = "10";
        System.out.println(xAsString + 5);

        int xAsNumber = Integer.parseInt(xAsString);
        System.out.println(xAsNumber + 5);

        int compareResult1 = Integer.compare(10, 5);
        System.out.println("...........................");
        System.out.println("Compare");
        System.out.println(compareResult1);
        if(compareResult1 > 0){
            System.out.println("erste Zahl ist großer als die zweite Zahl");
        }

        System.out.println();
        int compareResult2 = Integer.compare(5, 10);
        System.out.println(compareResult2);
        if(compareResult2 < 0){
            System.out.println("zweite Zahl ist großer als die erste Zahl");
        }

        System.out.println();
        int compareResult3 = Integer.compare(5, 5);
        System.out.println(compareResult3);
        if(compareResult3 == 0){
            System.out.println("beide Zahlen sind gleich");
        }
    }
}
