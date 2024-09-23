import java.util.Scanner;

public class GuessNumberDoWhile60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guessing game\n");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        Guess(num);
    }

    static int guess;
    public static void Guess(int num) {
        Scanner input = new Scanner(System.in);
        int count = 10;
        do {
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            count--;
            if (count == 0) {
                System.out.println("Your lost!");
                break;
            }
        } while (guess != num);
        if (guess == num) {
            System.out.println("You win");
        }
    }
}
