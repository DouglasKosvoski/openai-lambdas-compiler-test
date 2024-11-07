
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(patternMatch(5));
        System.out.println(patternMatch("Hello"));
        System.out.println(patternMatch(new Point(10, 20)));
        System.out.println(patternMatch(new Point(10, 30)));
        System.out.println(patternMatch(new Object()));
        System.out.println(patternMatch(null));
    }

    static String patternMatch(Object obj) {
        return switch (obj) {
            case Integer i && i < 10 -> "Single Digit";
            case Integer i && i >= 10 && i < 100 -> "Double Digit";
            case Integer i && i >= 100 -> "Triple Digit or More";
            case String s && s.length() > 5 -> "Long String";
            case String s -> "Short String";
            case Point p && p.x == 10 && p.y == 20 -> "Point at (10, 20)";
            case Point p -> "Point at another location";
            case null -> "Null Value";
            default -> "Unknown Type";
        };
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
