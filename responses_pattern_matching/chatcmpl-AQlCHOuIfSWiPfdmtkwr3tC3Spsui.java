
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPatternMatching(42));
        System.out.println(switchPatternMatching("Hello"));
        System.out.println(switchPatternMatching(3.14));
        System.out.println(switchPatternMatching(List.of(1, 2, 3)));
        System.out.println(switchPatternMatching(new int[]{1, 2, 3}));
        System.out.println(switchPatternMatching("A Long String That Is Quite Interesting"));
        System.out.println(switchPatternMatching(100));
        System.out.println(switchPatternMatching(true));
        System.out.println(switchPatternMatching(List.of("a", "b", "c")));
        System.out.println(switchPatternMatching(new Object()));
    }

    public static String switchPatternMatching(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s && s.length() > 10 -> "Long String: " + s;
            case String s -> "String: " + s;
            case Double d -> "Double: " + d;
            case List<?> l && l.size() > 5 -> "Large List: " + l;
            case List<?> l -> "List: " + l;
            case int[] arr && arr.length > 2 -> "Array with more than 2 elements: " + arr.length;
            case int[] arr -> "Array with " + arr.length + " elements";
            case Boolean b -> "Boolean: " + b;
            case Object o -> "Unrecognized object: " + o.getClass().getSimpleName();
            default -> "Unknown type";
        };
    }
}
