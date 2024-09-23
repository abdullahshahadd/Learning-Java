import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int percentage = input.nextInt();

        if (percentage >= 90) {
            System.out.println("You got an A!");
        } else if (percentage >= 75) {
            System.out.println("You got a B!");
        } else if (percentage >= 60) {
            System.out.println("You got a C.");
        } else if (percentage >= 30) {
            System.out.println("You got a D.");
        } else {
            System.out.println("You got a F.");
        }
    }
}
