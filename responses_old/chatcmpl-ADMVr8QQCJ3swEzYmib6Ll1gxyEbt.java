
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.forEach(name -> System.out.println(name));

        List<String> filteredNames = filterNames(names, name -> name.startsWith("A"));
        filteredNames.forEach(System.out::println);

        Runnable runnable = () -> System.out.println("Runnable executed!");
        runnable.run();

        Predicate<String> isLongName = name -> name.length() > 5;
        System.out.println(names.stream().filter(isLongName).count());

        names.stream()
             .map(name -> name.toUpperCase())
             .forEach(System.out::println);
    }

    public static List<String> filterNames(List<String> names, Predicate<String> predicate) {
        return names.stream().filter(predicate).toList();
    }
}
