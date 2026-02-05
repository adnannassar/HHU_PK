package StreamsAPI.ExamplesOfStreams;

import Packages.Mathe.Algebra.A;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreationOfStream {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Stream<Integer> s1 = Arrays.stream(numbers);
        s1.filter(number -> number % 2 == 0).forEach(number -> System.out.print(number + " "));

        System.out.println();

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> s2 = numberList.stream();
        s2.filter(number -> number % 2 != 0).forEach(number -> System.out.print(number + " "));

        System.out.println();
        Stream<Integer> s3 = Stream.of(1, 2, 3, 4, 5);
        s3.filter(number -> number > 2).forEach(number -> System.out.print(number + " "));
    }
}
