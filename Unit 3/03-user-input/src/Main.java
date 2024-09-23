import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");

        System.out.print("Enter first number: ");
        int num1 = myScanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = myScanner.nextInt();

        System.out.println(num1 + num2);
    }
}