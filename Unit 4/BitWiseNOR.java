import java.util.Scanner;

public class BitWiseNOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println(result);
    }
}
