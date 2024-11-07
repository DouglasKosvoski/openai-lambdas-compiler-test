
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object test = "Hello";
        System.out.println(patternMatch(test));
        
        test = 42;
        System.out.println(patternMatch(test));
        
        test = Arrays.asList(1, 2, 3);
        System.out.println(patternMatch(test));
        
        test = new Point(5, 10);
        System.out.println(patternMatch(test));
        
        test = null;
        System.out.println(patternMatch(test));
        
        test = "42";
        System.out.println(patternMatch(test));
        
        test = new int[]{1, 2, 3};
        System.out.println(patternMatch(test));
        
        test = new HashMap<String, Integer>() {{
            put("key", 1);
        }};
        System.out.println(patternMatch(test));
        
        test = new ArrayList<>() {{
            add(1);
            add("text");
        }};
        System.out.println(patternMatch(test));
    }

    static String patternMatch(Object obj) {
        return switch (obj) {
            case String s && s.length() > 0 -> "String of length " + s.length();
            case Integer i -> "Integer value: " + i;
            case List<?> list && !list.isEmpty() -> "List of size: " + list.size();
            case Point point -> "Point at: (" + point.getX() + ", " + point.getY() + ")";
            case null -> "Null value";
            case String s when s.matches("\\d+") -> "String representation of a number: " + s;
            case int[] arr && arr.length > 0 -> "Array of size: " + arr.length;
            case Map<?, ?> map && !map.isEmpty() -> "Map with size: " + map.size();
            case ArrayList<?> arrayList && !arrayList.isEmpty() -> "ArrayList with size: " + arrayList.size();
            default -> "Unknown type or empty structure";
        };
    }

    static class Point {
        private final int x;
        private final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
