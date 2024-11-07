
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(evaluateShape(new Circle(5)));
        System.out.println(evaluateShape(new Rectangle(4, 6)));
        System.out.println(evaluateShape(new Triangle(3, 4, 5)));
        System.out.println(evaluateShape(new UnknownShape()));
    }

    static String evaluateShape(Object shape) {
        return switch (shape) {
            case Circle circle -> "Circle with radius: " + circle.getRadius();
            case Rectangle rectangle -> "Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight();
            case Triangle triangle -> "Triangle with sides: " + Arrays.toString(new int[]{triangle.getSideA(), triangle.getSideB(), triangle.getSideC()});
            default -> "Unknown shape";
        };
    }
}

record Circle(int radius) {}
record Rectangle(int width, int height) {}
record Triangle(int sideA, int sideB, int sideC) {}
class UnknownShape {}
