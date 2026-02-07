package Args;

public class Main {
    public static void main(String[] args) {
        String[] names = {"test1", "test2", "test3"};
        print(names);
    }

    public static void print(String[] words){
        for(int i = 1; i <= words.length; i++){
            System.out.println(words[i-1] + " ist an der Position: " +  (i-1));
        }
    }
}
