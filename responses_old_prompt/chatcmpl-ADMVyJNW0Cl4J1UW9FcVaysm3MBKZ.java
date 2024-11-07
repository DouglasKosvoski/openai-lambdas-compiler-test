
import java.util.Arrays;
import java.util.List;

interface MyFunction {
    void execute();
}

interface MyIntFunction {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        MyFunction greet = () -> System.out.println("Hello, World!");
        greet.execute();

        MyIntFunction add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operate(5, 3));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name.toUpperCase()));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Sum: " + sum);
    }
}
