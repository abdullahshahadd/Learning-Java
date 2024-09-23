import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator\n");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you a female? (true/false)");
        boolean isFemale = input.nextBoolean();

        if (age > 60 && isFemale) {
            System.out.println("You have 75% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("You have 25% discount");
        } else if (isFemale) {
            System.out.println("You have 50% discount");
        } else if (age < 5) {
            System.out.println("You have 75% discount");
        } else {
            System.out.println("No discount");
        }

    }
}
