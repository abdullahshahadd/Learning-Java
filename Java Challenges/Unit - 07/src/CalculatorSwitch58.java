import java.util.Scanner;

public class CalculatorSwitch58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter your operator: ");
        String op = input.next();
        CalculatorSwitch58 calc = new CalculatorSwitch58();
        System.out.println(calc.calculator(num1, num2, op));
    }

    public int calculator(int num1, int num2, String op) {
        return switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };
    }
}
