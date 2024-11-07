
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda expression to create a thread
        new Thread(() -> System.out.println("Thread is running")).start();

        // Example 2: Sorting a list using a lambda expression
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.sort((a, b) -> b.compareTo(a));
        names.forEach(name -> System.out.println(name));

        // Example 3: Using a predicate to filter a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println("Even number: " + n));

        // Example 4: Using a function to square integers
        Function<Integer, Integer> square = x -> x * x;
        List<Integer> squares = Arrays.asList(1, 2, 3, 4).stream()
                .map(square)
                .toList();
        squares.forEach(s -> System.out.println("Square: " + s));

        // Example 5: Using a BiFunction to concatenate strings
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;
        String fullName = concat.apply("John", "Doe");
        System.out.println("Full Name: " + fullName);

        // Example 6: Using a comparator with a lambda expression
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        List<String> words = Arrays.asList("Java", "Python", "C", "JavaScript");
        words.sort(lengthComparator);
        words.forEach(word -> System.out.println("Word: " + word));
    }
}
