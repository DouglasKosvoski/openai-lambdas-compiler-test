
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPatternMatching(null));
        System.out.println(switchPatternMatching(42));
        System.out.println(switchPatternMatching("Hello"));
        System.out.println(switchPatternMatching(Optional.of(3.14)));
        System.out.println(switchPatternMatching(new int[]{1, 2, 3}));
        System.out.println(switchPatternMatching("Java 17"));
        System.out.println(switchPatternMatching(new Object() {
            @Override
            public String toString() {
                return "Anonymous Object";
            }
        }));
    }

    static String switchPatternMatching(Object obj) {
        return switch (obj) {
            case null -> "Null value";
            case Integer i && i > 10 -> "Integer more than 10: " + i;
            case Integer i -> "Integer up to 10: " + i;
            case String s && s.startsWith("Hello") -> "Greeting: " + s;
            case String s -> "String of length: " + s.length();
            case Optional<?> opt && opt.isPresent() -> "Optional with value: " + opt.get();
            case Optional<?> opt -> "Empty Optional";
            case int[] arr && arr.length > 0 -> "Array length: " + arr.length;
            case int[] arr -> "Empty array";
            case Main m -> "Instance of Main";
            default -> "Unknown type";
        };
    }
}
