import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter num2: ");
        float num2 = input.nextFloat();
        System.out.print("Enter num3: ");
        float num3 = input.nextFloat();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is the greatest");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is the greatest");
        } else {
            System.out.println("num3 is the greatest");
        }
    }
}
