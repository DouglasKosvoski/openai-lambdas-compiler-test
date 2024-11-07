
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        Object input = scanner.nextLine();

        String result = switch (input) {
            case String s && s.length() == 0 -> "Empty String";
            case String s && s.length() > 0 && s.length() <= 5 -> "Short String: " + s;
            case String s && s.length() > 5 -> "Long String: " + s;
            case Integer i && i >= 0 && i <= 10 -> "Small Integer: " + i;
            case Integer i && i > 10 && i <= 100 -> "Medium Integer: " + i;
            case Integer i && i > 100 -> "Large Integer: " + i;
            case Double d && d > 0.0 -> "Positive Double: " + d;
            case Double d && d < 0.0 -> "Negative Double: " + d;
            case Boolean b && b -> "True Boolean";
            case Boolean b && !b -> "False Boolean";
            case null -> "Null Value";
            default -> "Unknown Type";
        };

        System.out.println(result);
        
        // Testing with patterns on Enum
        for (TestEnum te : TestEnum.values()) {
            System.out.println(switch (te) {
                case RED -> "Color is Red";
                case GREEN -> "Color is Green";
                case BLUE -> "Color is Blue";
                default -> "Unknown Color";
            });
        }
    }

    enum TestEnum {
        RED, GREEN, BLUE
    }
}
