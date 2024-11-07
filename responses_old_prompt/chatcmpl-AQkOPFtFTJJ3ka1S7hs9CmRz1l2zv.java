
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Use case 1: Print all names
        Consumer<String> printer = name -> System.out.println(name);
        names.forEach(printer);

        // Use case 2: Filter names that start with 'C'
        Predicate<String> startsWithC = name -> name.startsWith("C");
        names.stream().filter(startsWithC).forEach(printer);

        // Use case 3: Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                            .map(name -> name.toUpperCase())
                                            .toList();
        upperCaseNames.forEach(printer);

        // Use case 4: Check if any name is longer than 5 characters
        boolean anyLongerThanFive = names.stream().anyMatch(name -> name.length() > 5);
        System.out.println("Any name longer than 5 characters: " + anyLongerThanFive);
    }
}
