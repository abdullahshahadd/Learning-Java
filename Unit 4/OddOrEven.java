import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float num = input.nextFloat();

        if (num % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
