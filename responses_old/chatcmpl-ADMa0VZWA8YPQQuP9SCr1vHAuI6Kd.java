
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // 1. Print all names
        names.forEach(name -> System.out.println(name));

        // 2. Filter names starting with 'C'
        names.stream()
             .filter(name -> name.startsWith("C"))
             .forEach(System.out::println);

        // 3. Check if any name has length > 5
        Predicate<String> hasLengthGreaterThanFive = name -> name.length() > 5;
        boolean anyMatch = names.stream().anyMatch(hasLengthGreaterThanFive);
        System.out.println(anyMatch);

        // 4. Map names to uppercase
        List<String> upperCaseNames = names.stream()
                                             .map(name -> name.toUpperCase())
                                             .toList();
        upperCaseNames.forEach(System.out::println);

        // 5. Count names with length <= 4
        long countShortNames = names.stream()
                                     .filter(name -> name.length() <= 4)
                                     .count();
        System.out.println(countShortNames);
    }
}
