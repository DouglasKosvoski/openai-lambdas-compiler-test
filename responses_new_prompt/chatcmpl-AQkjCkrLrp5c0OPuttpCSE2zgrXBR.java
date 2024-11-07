
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda expression to filter a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Example 2: Using lambda expression to square numbers
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Example 3: Using lambda expression with a custom Functional Interface
        MyConverter<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Hello': " + stringLength.convert("Hello"));

        // Example 4: Using lambda expression in a forEach loop
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Hello, " + name + "!"));

        // Example 5: Combining multiple lambda expressions
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        List<Integer> oddNumbers = numbers.stream()
                                           .filter(isOdd)
                                           .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);

        // Example 6: Using Consumer to print in a specific format
        Consumer<String> printFormatted = s -> System.out.println("Name: " + s);
        names.forEach(printFormatted);
    }

    @FunctionalInterface
    interface MyConverter<T, R> {
        R convert(T t);
    }
}
