import java.util.Scanner;

public class PositiveOrNegetive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float num = input.nextFloat();

        if (num > 0) {
            System.out.println("Your number is positive.");
        } else if (num < 0) {
            System.out.println("Your number is negetive.");
        } else if (num == 0) {
            System.out.println("Your number is zero.");
        }
    }
}
