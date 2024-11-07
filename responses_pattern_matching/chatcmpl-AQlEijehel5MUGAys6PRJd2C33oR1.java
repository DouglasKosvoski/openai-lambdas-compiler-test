
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object obj = "Hello";

        switch (obj) {
            case String s && s.length() > 5 -> System.out.println("Long String: " + s);
            case String s -> System.out.println("Short String: " + s);
            case Integer i && i > 100 -> System.out.println("Large Integer: " + i);
            case Integer i -> System.out.println("Integer: " + i);
            case null -> System.out.println("Null Object");
            default -> System.out.println("Unknown Type");
        }

        demonstrateVariations(2);
        demonstrateVariations("Test");
    }

    static void demonstrateVariations(Object obj) {
        switch (obj) {
            case Integer i && i % 2 == 0 -> System.out.println(i + " is even");
            case Integer i -> System.out.println(i + " is odd");
            case String s && s.contains("Test") -> System.out.println("Matched Test: " + s);
            case String s -> System.out.println("String without 'Test': " + s);
            case Double d -> System.out.println("Double value: " + d);
            case Character c -> System.out.println("Character: " + c);
            case Object o && !(o instanceof String || o instanceof Integer || o instanceof Double || o instanceof Character) -> System.out.println("Object of type: " + o.getClass().getName());
            default -> System.out.println("Unknown Object");
        }
    }
}
