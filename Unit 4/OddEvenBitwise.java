import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        if ((num1 & 1) == 1) {
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }
    }
}
