
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering names that start with 'A'
        List<String> filteredNames = names.stream()
                                           .filter(name -> name.startsWith("A"))
                                           .collect(Collectors.toList());
        System.out.println(filteredNames);

        // Example 2: Converting names to uppercase
        List<String> upperCaseNames = names.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        // Example 3: Checking if any name is longer than 5 characters
        boolean anyLongName = names.stream()
                                    .anyMatch(name -> name.length() > 5);
        System.out.println(anyLongName);

        // Example 4: Apply a function to convert names to their lengths
        Function<String, Integer> nameLength = String::length;
        List<Integer> lengths = names.stream()
                                      .map(nameLength)
                                      .collect(Collectors.toList());
        System.out.println(lengths);

        // Example 5: Count names by a predicate
        Predicate<String> hasFiveLetters = name -> name.length() == 5;
        long countOfFiveLetterNames = names.stream()
                                            .filter(hasFiveLetters)
                                            .count();
        System.out.println(countOfFiveLetterNames);
    }
}
