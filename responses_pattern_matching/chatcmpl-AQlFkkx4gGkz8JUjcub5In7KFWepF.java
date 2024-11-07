
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchShape("circle"));
        System.out.println(matchShape(List.of("square", "triangle", "rectangle")));
        System.out.println(matchShape(new Object()));
        System.out.println(matchShape(42));
        System.out.println(matchShape(new int[]{1, 2, 3}));
        System.out.println(matchShape("hexagon"));
        System.out.println(matchShape(new Shape("circle")));
        System.out.println(matchShape(new Animal("dog")));
    }

    static String matchShape(Object shape) {
        return switch (shape) {
            case "circle" -> "This is a circle.";
            case "square" -> "This is a square.";
            case String s && s.length() > 5 -> "This is a long-named shape: " + s;
            case List<String> shapes && shapes.size() > 2 ->
                "This is a list of shapes: " + shapes;
            case Shape s -> "This is a custom shape: " + s.name;
            case Animal a -> "This is an animal shape: " + a.type;
            case Integer i && i > 10 -> "This is a large number: " + i;
            default -> "Unknown shape type";
        };
    }

    static class Shape {
        String name;
        
        Shape(String name) {
            this.name = name;
        }
    }

    static class Animal {
        String type;
        
        Animal(String type) {
            this.type = type;
        }
    }
}
