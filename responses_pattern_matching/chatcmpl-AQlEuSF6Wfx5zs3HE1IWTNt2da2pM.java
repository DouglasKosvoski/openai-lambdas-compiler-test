
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(describe(42));
        System.out.println(describe("Hello"));
        System.out.println(describe(List.of(1, 2, 3)));
        System.out.println(describe(Map.of("key", "value")));
        System.out.println(describe(new Object()));
    }

    static String describe(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case List<?> list when !list.isEmpty() ->
                "List with " + list.size() + " elements: " + list;
            case List<?> list ->
                "Empty List";
            case Map<?, ?> map when !map.isEmpty() ->
                "Map with " + map.size() + " entries: " + map;
            case Map<?, ?> map ->
                "Empty Map";
            case null -> "Null value";
            default -> "Unknown type: " + obj.getClass().getName();
        };
    }
}
