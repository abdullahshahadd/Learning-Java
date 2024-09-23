import java.util.Scanner;

public class BitWiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND operator\n");
        System.out.print("Enter First number: ");
        int first = input.nextInt();
        System.out.print("Enter Second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println(result);
    }
}
