import java.util.Scanner;

public class PrimeNumberForLoop62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        System.out.println(PrimeNumber(num) ? "Prime Number." : "Not Prime Number.");
    }

    public static boolean PrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
