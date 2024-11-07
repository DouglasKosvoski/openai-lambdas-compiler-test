
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression to print values
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 2: Lambda expression with a condition
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                                             .filter(n -> n % 2 == 0)
                                             .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Example 3: Lambda expression to square numbers
        List<Integer> squared = numbers.stream()
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());
        System.out.println(squared);

        // Example 4:Using lambda with Comparator
        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println(names);

        // Example 5: Lambda expression returning a value
        MyFunctionalInterface myFunc = (x, y) -> x + y;
        System.out.println("Sum: " + myFunc.calculate(5, 10));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int calculate(int a, int b);
    }
}
