import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        System.out.println(primenumber(num));
    }

    public static String primenumber(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return "Not Prime number.";
            }
            i++;
        }
        return "Prime number";
    }
}
