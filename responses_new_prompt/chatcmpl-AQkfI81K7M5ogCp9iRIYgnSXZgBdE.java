
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda expression to sort a list of strings by length
        List<String> names = Arrays.asList("John", "Alexander", "Emily", "Zoe", "Christopher");
        List<String> sortedNames = names.stream()
                                         .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                                         .collect(Collectors.toList());
        System.out.println("Sorted names by length: " + sortedNames);

        // Example 2: Using lambda expression as a Predicate to filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Example 3: Lambda expression to compute square of each number in a list
        List<Integer> squares = numbers.stream()
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());
        System.out.println("Squares of numbers: " + squares);

        // Example 4: Using a lambda expression with Function to convert strings to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        List<String> upperCaseNames = names.stream()
                                            .map(toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Uppercase names: " + upperCaseNames);

        // Example 5: Multi-line lambda expression to find the maximum number in a list
        Integer maxNumber = numbers.stream()
                                    .reduce(Integer.MIN_VALUE, 
                                        (max, current) -> current > max ? current : max);
        System.out.println("Maximum number: " + maxNumber);
    }
}
