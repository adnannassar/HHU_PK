package WrapperKlasses;

public class Strings {
    public static void main(String[] args) {
        char[] name = {'N','O','R','A'};

        int x = 10;

        char a = 'b';
        boolean isEtwas = false;

        String word = "Hallo"; // Im Hintergrund: String word1 = new String("Hallo");

        System.out.println(word.length());
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.charAt(0));
        System.out.println(word.compareTo("Hello")); // false
        System.out.println(word.compareTo("HALLO")); // false
        System.out.println(word.compareToIgnoreCase("HALLO")); // true
        System.out.println(word.compareToIgnoreCase("HaLlO")); // true
        System.out.println(word.contains("Z")); // false
        System.out.println(word.contains("H")); // true
        System.out.println(word.equals("Hallo")); // true
        System.out.println(word.startsWith("Ha"));
        System.out.println(word.endsWith("o"));
        System.out.println(word.isEmpty()); // false

        char[] wordAsCharArray = word.toCharArray(); // {'H','a','l','l','o'}
    }


}
