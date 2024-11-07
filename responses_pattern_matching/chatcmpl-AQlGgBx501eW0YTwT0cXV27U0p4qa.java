
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(processInput("Hello"));
        System.out.println(processInput(42));
        System.out.println(processInput(3.14));
        System.out.println(processInput(new Point(5, 10)));
        System.out.println(processInput(null));
    }

    public static String processInput(Object input) {
        return switch(input) {
            case String s -> "String of length: " + s.length();
            case Integer i when i > 0 -> "Positive integer: " + i;
            case Integer i -> "Non-positive integer: " + i;
            case Double d -> "Double value: " + d;
            case Point p -> "Point at: (" + p.x + ", " + p.y + ")";
            case null -> "Null input";
            default -> "Unknown type";
        };
    }

    static record Point(int x, int y) {}
}
