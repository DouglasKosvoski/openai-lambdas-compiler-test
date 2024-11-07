
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filter names that start with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 2: Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                            .map(name -> name.toUpperCase())
                                            .toList();
        System.out.println(upperCaseNames);

        // Example 3: Check if any name has length greater than 5
        Predicate<String> isLongName = name -> name.length() > 5;
        boolean anyLongNames = names.stream().anyMatch(isLongName);
        System.out.println(anyLongNames);

        // Example 4: Calculate the length of each name
        Function<String, Integer> nameLength = name -> name.length();
        List<Integer> nameLengths = names.stream()
                                          .map(nameLength)
                                          .toList();
        System.out.println(nameLengths);
    }
}
