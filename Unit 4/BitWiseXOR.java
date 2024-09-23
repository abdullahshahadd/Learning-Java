import java.util.Scanner;

public class BitWiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR operator\n");
        System.out.print("Enter First number: ");
        int first = input.nextInt();
        System.out.print("Enter Second number: ");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println(result);
    }
}
