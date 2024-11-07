
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Object> inputs = new ArrayList<>();
        inputs.add(42);
        inputs.add("Hello");
        inputs.add(3.14);
        inputs.add(new int[]{1, 2, 3});
        inputs.add(null);
        inputs.add(new CustomType("Test"));

        for (Object input : inputs) {
            System.out.println(switchPattern(input));
        }
    }

    static String switchPattern(Object input) {
        return switch (input) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s.toUpperCase();
            case Double d -> "Double: " + (d + 1);
            case int[] arr -> "Array: " + arr.length + " elements";
            case null -> "Input was null";
            case CustomType ct -> "CustomType: " + ct.getName();
            default -> "Unknown type: " + input.getClass().getName();
        };
    }

    static class CustomType {
        String name;

        CustomType(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
}
