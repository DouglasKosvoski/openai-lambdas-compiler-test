
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Object> inputs = new ArrayList<>();
        inputs.add(1);
        inputs.add("Hello");
        inputs.add(5.5);
        inputs.add(new Dog());
        inputs.add(new Cat());
        inputs.add(new Object());
        inputs.add(Optional.of("Optional String"));
        
        for (Object input : inputs) {
            System.out.println(switchPattern(input));
        }
    }

    public static String switchPattern(Object obj) {
        return switch (obj) {
            case Integer i && i > 0 -> "Positive Integer: " + i;
            case Integer i && i < 0 -> "Negative Integer: " + i;
            case String s -> "String: " + s;
            case Double d -> "Double: " + d;
            case Dog dog -> "Dog instance";
            case Cat cat -> "Cat instance";
            case List<?> list when list.size() > 0 -> "List with elements";
            case Optional<?> opt && opt.isPresent() -> "Optional with value: " + opt.get();
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }

    static class Dog {}
    static class Cat {}
}
