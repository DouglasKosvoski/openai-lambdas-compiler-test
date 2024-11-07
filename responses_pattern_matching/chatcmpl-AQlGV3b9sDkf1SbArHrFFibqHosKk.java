
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = Arrays.asList("Hello", 20, 30.5, new Point(5, 10), null, "World", 15);

        for (Object item : items) {
            switch (item) {
                case String s -> System.out.println("String of length " + s.length() + ": " + s);
                case Integer i && i > 15 -> System.out.println("Integer greater than 15: " + i);
                case Integer i -> System.out.println("Integer: " + i);
                case Double d -> System.out.println("Double: " + d);
                case Point p -> System.out.println("Point with coordinates: " + p);
                case null -> System.out.println("Null value");
                default -> System.out.println("Unknown type: " + item.getClass().getSimpleName());
            }
        }
    }

    static record Point(int x, int y) {}
}
