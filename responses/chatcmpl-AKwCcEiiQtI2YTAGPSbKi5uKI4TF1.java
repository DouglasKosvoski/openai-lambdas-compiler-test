
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Example 1: Printing each string
        strings.forEach(s -> System.out.println(s));

        // Example 2: Filtering strings starting with 'b'
        strings.stream()
               .filter(s -> s.startsWith("b"))
               .forEach(s -> System.out.println(s));

        // Example 3: Using a custom predicate
        Predicate<String> isLongerThanFive = s -> s.length() > 5;
        strings.stream()
               .filter(isLongerThanFive)
               .forEach(s -> System.out.println(s));

        // Example 4: Mapping strings to their lengths
        List<Integer> lengths = strings.stream()
                                       .map(String::length)
                                       .toList();
        lengths.forEach(length -> System.out.println(length));

        // Example 5: Reducing to a single concatenated string
        String concatenated = strings.stream()
                                     .reduce("", (s1, s2) -> s1 + s2);
        System.out.println(concatenated);
    }
}
