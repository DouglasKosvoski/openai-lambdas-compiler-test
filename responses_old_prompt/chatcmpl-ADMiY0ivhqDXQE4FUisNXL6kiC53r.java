
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.forEach(name -> System.out.println(name));

        Predicate<String> startsWithA = s -> s.startsWith("A");
        names.stream().filter(startsWithA).forEach(name -> System.out.println(name));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("Sum: " + sum);

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() > 3)
                .toList();
        System.out.println("Filtered Names: " + filteredNames);
        
        Runnable runnable = () -> System.out.println("Running in a new thread");
        new Thread(runnable).start();
    }
}
