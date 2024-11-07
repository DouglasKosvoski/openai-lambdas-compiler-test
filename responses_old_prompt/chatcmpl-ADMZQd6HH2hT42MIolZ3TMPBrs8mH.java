
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        
        // Example 1: Print names that start with 'A'
        names.forEach(name -> {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        });
        
        // Example 2: Filter names with length greater than 3
        Predicate<String> longerThanThree = name -> name.length() > 3;
        names.stream().filter(longerThanThree).forEach(System.out::println);
        
        // Example 3: Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                             .map(name -> name.toUpperCase())
                                             .toList();
        upperCaseNames.forEach(System.out::println);
        
        // Example 4: Count names that contain the letter 'i'
        long count = names.stream().filter(name -> name.contains("i")).count();
        System.out.println("Count of names containing 'i': " + count);
        
        // Example 5: Sort names by their length
        names.stream()
             .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
             .forEach(System.out::println);
    }
}
