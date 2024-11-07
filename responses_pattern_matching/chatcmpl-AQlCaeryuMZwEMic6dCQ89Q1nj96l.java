
import java.util.Objects;

class Main {
    public static void main(String[] args) {
        Object obj = getRandomObject();
        System.out.println(switch (obj) {
            case String str -> "String of length: " + str.length();
            case Integer i && (i > 0) -> "Positive Integer: " + i;
            case Integer i -> "Integer: " + i;
            case null -> "Null Object";
            case Double d && (d < 0.0) -> "Negative Double: " + d;
            case Double d -> "Double: " + d;
            case Character c -> "Character: " + c;
            case String s -> s.toUpperCase();
            default -> "Unknown Type";
        });
    }

    private static Object getRandomObject() {
        // Import necessary randomness for object generation
        double rand = Math.random();
        if (rand < 0.2) return "Hello, World!";
        if (rand < 0.4) return 42;
        if (rand < 0.6) return -3.14;
        if (rand < 0.8) return 'A';
        return null;
    }
}
