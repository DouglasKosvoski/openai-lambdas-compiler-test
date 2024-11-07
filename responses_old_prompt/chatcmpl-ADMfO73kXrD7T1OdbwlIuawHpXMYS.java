
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Example 1: Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Function
        Function<String, Integer> nameLength = name -> name.length();
        List<Integer> lengths = names.stream()
                                      .map(nameLength)
                                      .toList();
        System.out.println(lengths);

        // Example 4: BiFunction
        System.out.println(concatenate("Hello, ", "World!"));
    }

    public static String concatenate(String s1, String s2) {
        return ((Function<String, Function<String, String>>) (s -> (s2) -> s + s2)).apply(s1).apply(s2);
    }
}
