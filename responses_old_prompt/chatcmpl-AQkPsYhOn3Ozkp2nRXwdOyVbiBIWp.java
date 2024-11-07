
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.forEach(name -> System.out.println("Hello, " + name));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(n -> n * n).forEach(System.out::println);

        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        List<Integer> filteredNumbers = 
            numbers.stream().filter(n -> n % 2 == 0).toList();
        filteredNumbers.forEach(System.out::println);
    }
}
