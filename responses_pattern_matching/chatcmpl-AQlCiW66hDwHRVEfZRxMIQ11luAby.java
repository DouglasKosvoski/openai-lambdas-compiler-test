
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] testObjects = {1, "Test", 3.14, null, List.of(1, 2, 3)};
        
        for (Object obj : testObjects) {
            switch (obj) {
                case Integer i && i > 0 -> System.out.println(i + " is a positive integer.");
                case String s && s.length() > 0 -> System.out.println("\"" + s + "\" is a non-empty string.");
                case Double d && d < 0 -> System.out.println(d + " is a negative double.");
                case null -> System.out.println("The object is null.");
                case List<?> list && list.size() > 0 -> System.out.println("A non-empty list: " + list);
                default -> System.out.println("Unhandled type: " + obj.getClass().getSimpleName());
            }
        }

        Object randomObj = getRandomObject();
        switch (randomObj) {
            case Integer i -> {
                System.out.println("Random Integer: " + i);
                switch (i) {
                    case 0 -> System.out.println("Zero!");
                    case -1 -> System.out.println("Negative One!");
                    case 1, 2 -> System.out.println("One or Two!");
                    default -> System.out.println("Some other Integer: " + i);
                }
            }
            case String s -> System.out.println("Random String: " + s.toUpperCase());
            case Double d -> System.out.println("Random Double: " + d);
            default -> System.out.println("Random object of type: " + randomObj.getClass().getSimpleName());
        }
    }

    private static Object getRandomObject() {
        // This function should return a random Object, 
        // but for simplicity, it just returns a hardcoded value for demonstration purpose
        return "Hello World";
    }
}
