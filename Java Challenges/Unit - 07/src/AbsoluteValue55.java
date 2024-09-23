import java.util.Scanner;

public class AbsoluteValue55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = input.nextInt();
        int abValue = num < 0 ? -num : num;
        System.out.println(abValue);
    }
}
