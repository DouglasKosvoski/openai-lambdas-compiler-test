
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] inputs = { "Hello", 42, 3.14, List.of(1, 2, 3), new Exception("Error"), true };

        for (Object input : inputs) {
            switch (input) {
                case String s:
                    System.out.println("String: " + s);
                    break;
                case Integer i when i > 0:
                    System.out.println("Positive Integer: " + i);
                    break;
                case Integer i:
                    System.out.println("Integer: " + i);
                    break;
                case Double d:
                    System.out.println("Double: " + d);
                    break;
                case List<?> lst:
                    System.out.println("List of size " + lst.size());
                    break;
                case Exception e:
                    System.out.println("Caught Exception: " + e.getMessage());
                    break;
                case Boolean b:
                    System.out.println("Boolean: " + b);
                    break;
                default:
                    System.out.println("Unknown type");
            }
        }

        System.out.println(patternMatching("Switch case example"));
        System.out.println(patternMatching(100));
        System.out.println(patternMatching(0.001));
        System.out.println(patternMatching(List.of("A", "B", "C")));
        System.out.println(patternMatching(new RuntimeException("Runtime Error")));
        System.out.println(patternMatching(false));
    }

    public static String patternMatching(Object obj) {
        return switch (obj) {
            case String str -> "String: " + str;
            case Integer num when num < 0 -> "Negative Integer: " + num;
            case Integer num -> "Integer: " + num;
            case Double d when d > 1.0 -> "Large Double: " + d;
            case List<?> list when list.size() > 3 -> "Long List of size: " + list.size();
            case Exception exception -> "Handled Exception: " + exception.getMessage();
            case Boolean bool -> "Boolean value: " + bool;
            default -> "No match found";
        };
    }
}
