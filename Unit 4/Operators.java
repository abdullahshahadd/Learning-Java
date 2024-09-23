import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter num2: ");
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        float substract = num1 - num2;
        float multiply = num1 * num2;
        float divide = num1 / num2;
        float remainder = num1 % num2;

        System.out.println(sum);
        System.out.println(substract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);

    }
}
