
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        names.forEach(name -> System.out.println(name.toUpperCase()));
        
        Predicate<String> startsWithA = s -> s.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("Sum: " + sum);

        Runnable task = () -> System.out.println("Task executed");
        task.run();
        
        names.sort((s1, s2) -> s1.compareTo(s2));
        names.forEach(System.out::println);
    }
}
