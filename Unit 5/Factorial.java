import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        System.out.println(factorial(input.nextInt()));
    }

    public static long factorial(int given) {
        long result = 1;
        while (given > 0) {
            result *= given;
            given--;
        }
        return result;
    }
}
