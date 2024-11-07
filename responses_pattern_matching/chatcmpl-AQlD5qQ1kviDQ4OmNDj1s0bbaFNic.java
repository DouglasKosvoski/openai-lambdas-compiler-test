
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = Arrays.asList("Hello", 42, 3.14, null, new Point(1, 2), new Point[]{new Point(3, 4)});

        for (Object item : items) {
            String result = switch (item) {
                case String s -> "String: " + s;
                case Integer i when i > 0 -> "Positive Integer: " + i;
                case Integer i -> "Integer: " + i;
                case Double d -> "Double: " + d;
                case null -> "Null Value";
                case Point p -> "Point: " + p;
                case Point[] points -> "Array of Points: " + Arrays.toString(points);
                default -> "Unknown Type";
            };
            System.out.println(result);
        }

        Object obj = getSomeObject();
        String complexResult = switch (obj) {
            case Integer i && i > 100 -> "Large Integer: " + i;
            case String s && s.length() > 5 -> "Long String: " + s;
            case Object o -> "Some Object: " + o.getClass().getSimpleName();
            default -> "Nothing Matched";
        };
        System.out.println(complexResult);
    }

    private static Object getSomeObject() {
        return 101; // Change this to test different scenarios
    }

    static record Point(int x, int y) {
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}
