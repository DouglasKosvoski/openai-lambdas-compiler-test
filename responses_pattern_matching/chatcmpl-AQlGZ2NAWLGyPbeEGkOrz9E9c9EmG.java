
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPatternMatch("Hello")); // String case
        System.out.println(switchPatternMatch(42)); // Integer case
        System.out.println(switchPatternMatch(3.14)); // Double case
        System.out.println(switchPatternMatch(new Point(1, 2))); // Custom Object case
        System.out.println(switchPatternMatch(new Object())); // Default case
        System.out.println(switchPatternMatch(null)); // Null case
    }

    static String switchPatternMatch(Object obj) {
        return switch (obj) {
            case String s -> "String case with value: " + s;
            case Integer i when i > 0 -> "Positive Integer case: " + i;
            case Integer i -> "Integer case: " + i;
            case Double d when d < 10.0 -> "Small Double case: " + d;
            case Double d -> "Double case: " + d;
            case Point p -> "Point case with coordinates: (" + p.x + ", " + p.y + ")";
            case null -> "Null case";
            default -> "Default case for unknown type";
        };
    }

    static record Point(int x, int y) {}
}
