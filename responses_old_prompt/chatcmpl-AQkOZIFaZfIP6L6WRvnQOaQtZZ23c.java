
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering with lambda
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 2: Mapping with lambda
        List<Integer> nameLengths = names.stream()
                                          .map(String::length)
                                          .toList();
        System.out.println(nameLengths);

        // Example 3: Predicate with lambda
        Predicate<String> startsWithB = name -> name.startsWith("B");
        names.stream()
             .filter(startsWithB)
             .forEach(System.out::println);

        // Example 4: Function with lambda
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        names.stream()
             .map(toUpperCase)
             .forEach(System.out::println);
    }
}
