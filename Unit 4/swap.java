import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = myScanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = myScanner.nextInt();
        int swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("Now num1 is: " + num1);
        System.out.println("Now num2 is: " + num2);
    }
}
