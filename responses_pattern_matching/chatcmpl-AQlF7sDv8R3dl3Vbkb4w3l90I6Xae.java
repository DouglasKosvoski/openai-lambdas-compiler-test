
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object obj = "Hello";

        System.out.println(switch (obj) {
            case Integer i -> "It's an integer: " + i;
            case String s && s.length() > 5 -> "Long string: " + s;
            case String s -> "Short string: " + s;
            case Optional<?> opt && opt.isPresent() -> "Optional with value: " + opt.get();
            case null -> "It's null";
            default -> "Unknown type";
        });

        System.out.println(switch (obj) {
            case String s -> switch (s) {
                case "Hello" -> "Greeting detected!";
                case "Goodbye" -> "Farewell!";
                default -> "Just a string.";
            };
            case Integer i && i > 0 -> "Positive integer: " + i;
            default -> "Not handled";
        });

        // Testing with more cases
        Object[] arr = {1, "test", 3.14, null};

        for (Object a : arr) {
            System.out.println(switch (a) {
                case Integer i -> i % 2 == 0 ? "Even integer: " + i : "Odd integer: " + i;
                case String str && str.contains("!") -> "Exciting string: " + str;
                case String str -> "Normal string: " + str;
                case null -> "Nothing here!";
                default -> "Some other type: " + a.getClass().getSimpleName();
            });
        }

        // Corner cases with more complex patterns
        System.out.println(switch (new Object()) {
            case Integer i && i > 0 -> "It's a positive integer!";
            case String s && s.length() > 0 -> "It's a non-empty string!";
            case MyCustomClass c -> "It's a custom class instance!";
            case null -> "Received null!";
            case default -> "Unknown type encountered!";
        });
    }
}

class MyCustomClass {}
