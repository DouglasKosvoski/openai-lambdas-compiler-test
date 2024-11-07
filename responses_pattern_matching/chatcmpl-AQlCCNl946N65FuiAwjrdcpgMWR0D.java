
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> inputs = Arrays.asList("Hello", 42, 3.14, new Point(1, 2), Optional.of("Optional"), null);
        for (Object input : inputs) {
            System.out.println(switch(input) {
                case String s -> "String: " + s;
                case Integer i && i > 0 -> "Positive Integer: " + i;
                case Integer i -> "Integer: " + i;
                case Double d && d >= 0.0 -> "Non-negative Double: " + d;
                case Double d -> "Double: " + d;
                case Point p && p.x > 0 && p.y > 0 -> "Point in Quadrant I: " + p;
                case Point p -> "Point: " + p;
                case Optional<?> opt && opt.isPresent() -> "Present: " + opt.get();
                case Optional<?> opt -> "Empty Optional";
                case null -> "Null Value";
                default -> "Unknown Type";
            });
        }
    }

    static class Point {
        int x, y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}
