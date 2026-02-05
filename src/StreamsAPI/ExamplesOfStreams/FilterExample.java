package StreamsAPI.ExamplesOfStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        oldWithOutStream();
        System.out.println();
        newWithStream();
    }

    public static void newWithStream() {
        Stream.of("Ammar", "Nora", "Zakaria", "Suyasar", "Selim", "Bashir")
                .filter(name -> name.startsWith("S"))
                .forEach(name -> System.out.print(name + " "));
    }

    public static void oldWithOutStream() {
        List<String> names = new ArrayList<>();
        names.add("Ammar");
        names.add("Nora");
        names.add("Zakaria");
        names.add("Muyasar");
        names.add("Selim");
        names.add("Bashir");

        List<String> filterdNames = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("S")) {
                filterdNames.add(name);
            }
        }

        for (String name : filterdNames) {
            System.out.println(name);
        }
    }


}
