
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Printing names
        names.forEach(name -> System.out.println(name));

        // Example 2: Filtering names
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 3: Sorting names
        names.sort((a, b) -> b.compareTo(a));
        names.forEach(System.out::println);

        // Example 4: Mapping names to their lengths
        List<Integer> nameLengths = names.stream()
                                          .map(String::length)
                                          .toList();
        nameLengths.forEach(System.out::println);

        // Example 5: Using a custom functional interface
        MyFunctionalInterface greet = () -> "Hello, World!";
        System.out.println(greet.message());
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        String message();
    }
}
