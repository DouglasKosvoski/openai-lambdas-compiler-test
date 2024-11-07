
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        System.out.println("Names starting with 'A':");
        names.stream()
            .filter(name -> name.startsWith("A"))
            .forEach(System.out::println);

        System.out.println("\nLengths of names:");
        Function<String, Integer> lengthFunction = name -> name.length();
        names.stream()
            .map(lengthFunction)
            .forEach(System.out::println);

        System.out.println("\nNames with more than 3 letters:");
        Predicate<String> longNamePredicate = name -> name.length() > 3;
        names.stream()
            .filter(longNamePredicate)
            .forEach(System.out::println);

        System.out.println("\nUppercase names:");
        names.stream()
            .map(name -> name.toUpperCase())
            .forEach(System.out::println);
    }
}
