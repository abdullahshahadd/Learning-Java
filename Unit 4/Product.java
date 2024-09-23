import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter num2: ");
        float num2 = input.nextFloat();
        System.out.println(num1 * num2);
    }
}
