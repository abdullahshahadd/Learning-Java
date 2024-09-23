import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to driving license Portal");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Your are eligible to drive");
        } else {
            System.out.println("Ride a cycle bruh...");
        }
    }
}
