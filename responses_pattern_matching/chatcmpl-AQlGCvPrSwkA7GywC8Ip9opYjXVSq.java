
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object input = "String Example"; // Test with different types of inputs
        System.out.println(match(input));

        input = 123;
        System.out.println(match(input));

        input = List.of(1, 2, 3);
        System.out.println(match(input));

        input = new int[]{1, 2, 3};
        System.out.println(match(input));

        input = null;
        System.out.println(match(input));
    }

    public static String match(Object obj) {
        return switch (obj) {
            case String s -> "Matched string: " + s;
            case Integer i -> "Matched integer: " + i;
            case List<?> list -> "Matched list with size: " + list.size();
            case int[] arr -> "Matched array with length: " + arr.length;
            case null -> "Matched null";
            default -> "No match found";
        };
    }
}
