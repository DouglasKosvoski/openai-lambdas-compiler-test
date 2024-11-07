
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Simple lambda expression
        Runnable task = () -> System.out.println("Hello from a thread!");
        new Thread(task).start();

        // 2. Lambda expression with parameters
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // 3. Lambda expression with return value
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(squares);

        // 4. Predicate lambda expression
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // 5. Comparator lambda expression
        List<String> sortedNames = names.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println(sortedNames);
    }
}
