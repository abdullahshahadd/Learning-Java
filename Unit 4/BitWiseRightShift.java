import java.util.Scanner;

public class BitWiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int result = num >> 4;
        System.out.println(result);
    }
}
