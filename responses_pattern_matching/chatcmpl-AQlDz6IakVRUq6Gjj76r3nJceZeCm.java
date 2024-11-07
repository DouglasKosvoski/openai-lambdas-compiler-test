
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = Arrays.asList("Hello", 123, 45.67, new int[]{1, 2, 3}, true, null);

        for (Object item : items) {
            switch (item) {
                case String s -> System.out.println("String: " + s);
                case Integer i when i > 100 -> System.out.println("Integer > 100: " + i);
                case Integer i -> System.out.println("Integer: " + i);
                case Double d -> System.out.println("Double: " + d);
                case int[] arr when arr.length > 0 -> System.out.println("Array with length > 0: " + Arrays.toString(arr));
                case int[] arr -> System.out.println("Empty Array");
                case Boolean b -> System.out.println("Boolean: " + b);
                case null -> System.out.println("Null value");
                default -> System.out.println("Unknown type: " + item.getClass().getName());
            }
        }

        printPatternMatching(5);
        printPatternMatching("Test");
        printPatternMatching(new Object());
    }

    static void printPatternMatching(Object obj) {
        switch (obj) {
            case Integer i when i % 2 == 0 -> System.out.println(i + " is even.");
            case Integer i -> System.out.println(i + " is odd.");
            case String s && s.length() > 5 -> System.out.println("Long string: " + s);
            case String s -> System.out.println("Short string: " + s);
            case null -> System.out.println("Received null");
            default -> System.out.println("Other type: " + obj.getClass().getName());
        }
    }
}
