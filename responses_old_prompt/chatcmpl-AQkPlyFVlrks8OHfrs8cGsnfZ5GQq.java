
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filter names that start with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 2: Sort names by length
        names.sort(Comparator.comparingInt(String::length));
        names.forEach(System.out::println);

        // Example 3: Map names to their lengths
        List<Integer> lengths = names.stream()
                                      .map(String::length)
                                      .toList();
        lengths.forEach(System.out::println);

        // Example 4: Sum lengths of names
        int totalLength = names.stream()
                               .mapToInt(String::length)
                               .sum();
        System.out.println(totalLength);

        // Example 5: Check if any name starts with 'C'
        boolean anyStartsWithC = names.stream()
                                       .anyMatch(name -> name.startsWith("C"));
        System.out.println(anyStartsWithC);
    }
}
