
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression to filter a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                                           .filter(name -> name.startsWith("A"))
                                           .collect(Collectors.toList());
        System.out.println(filteredNames);

        // Example 2: Using a lambda expression to sort a list
        List<Integer> numbers = Arrays.asList(4, 2, 1, 3);
        List<Integer> sortedNumbers = numbers.stream()
                                              .sorted((a, b) -> b - a)
                                              .collect(Collectors.toList());
        System.out.println(sortedNumbers);
        
        // Example 3: Using a lambda expression as a Predicate
        Predicate<String> isLongerThanThree = str -> str.length() > 3;
        System.out.println(isLongerThanThree.test("Java")); // true
        System.out.println(isLongerThanThree.test("Go")); // false

        // Example 4: Using a lambda expression with Function
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Lambda")); // 6

        // Example 5: Using a lambda expression with Runnable
        Runnable runnable = () -> System.out.println("Hello from a lambda expression!");
        runnable.run();

        // Example 6: Using a lambda expression to map a list
        List<String> words = Arrays.asList("one", "two", "three");
        List<Integer> wordLengths = words.stream()
                                          .map(word -> word.length())
                                          .collect(Collectors.toList());
        System.out.println(wordLengths);

        // Example 7: Using a lambda expression to create a custom functional interface
        MyFunctionalInterface myFunc = (a, b) -> a + b;
        int result = myFunc.add(5, 10);
        System.out.println(result);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int add(int a, int b);
    }
}
