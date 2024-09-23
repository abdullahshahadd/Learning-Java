import java.util.Scanner;

public class OddEvenTernary54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);
    }
}
