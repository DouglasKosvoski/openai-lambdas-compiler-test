
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> inputs = Arrays.asList("Hello", 42, 3.14, new Point(5, 10), Optional.of("Test"), null);
        
        for (Object input : inputs) {
            System.out.println(switch (input) {
                case String s -> "String of length " + s.length();
                case Integer i when i > 0 -> "Positive Integer: " + i;
                case Integer i -> "Non-positive Integer: " + i;
                case Double d -> "Double value: " + d;
                case Point p when p.x > 0 && p.y > 0 -> "Point in positive quadrant: " + p;
                case Point p -> "Point: " + p;
                case Optional<?> opt -> opt.map(o -> "Optional with value: " + o).orElse("Empty Optional");
                case null -> "Null value";
                default -> "Unknown type";
            });
        }
    }

    static record Point(int x, int y) {}
}
