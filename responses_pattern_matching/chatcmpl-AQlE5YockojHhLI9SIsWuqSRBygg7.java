
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> inputs = Arrays.asList(
            "Hello", 
            42, 
            3.14, 
            new int[]{1, 2, 3}, 
            new HashMap<String, String>() {{ put("key", "value"); }},
            null,
            new ArrayList<>(),
            new Object()
        );

        for (Object input : inputs) {
            switch (input) {
                case String s -> System.out.println("String: " + s);
                case Integer i when i > 0 -> System.out.println("Positive Integer: " + i);
                case Integer i -> System.out.println("Integer: " + i);
                case Double d -> System.out.println("Double: " + d);
                case int[] arr when arr.length > 0 -> System.out.println("Array of length: " + arr.length);
                case HashMap<?, ?> map when map.containsKey("key") -> System.out.println("Map with key 'key': " + map);
                case null -> System.out.println("Null value");
                case List<?> list when list.isEmpty() -> System.out.println("Empty List");
                case Object obj -> System.out.println("Other Object: " + obj.getClass().getName());
                default -> System.out.println("Unknown type");
            }
        }

        // Stretching with repetitive and nested switches
        Object complexInput = new HashMap<String, Object>() {{
            put("key1", new ArrayList<>(Arrays.asList(1, 2, 3)));
            put("key2", new HashMap<String, Object>() {{ put("nestedKey", "nestedValue"); }});
        }};

        switch (complexInput) {
            case HashMap<?, ?> complexMap -> {
                switch (complexMap.get("key1")) {
                    case List<?> list when !list.isEmpty() -> System.out.println("List from map with elements: " + list);
                }
                switch (complexMap.get("key2")) {
                    case HashMap<?, ?> nestedMap -> System.out.println("Nested Map: " + nestedMap);
                }
            }
            default -> System.out.println("Not a complex map");
        }
    }
}
