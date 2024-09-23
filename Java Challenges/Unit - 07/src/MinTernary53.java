import java.util.Scanner;

public class MinTernary53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        MinTernary53 ternary = new MinTernary53();
        int minNum = ternary.min(num1, num2);
        System.out.println(minNum);
    }

    public int min(int num1, int num2) {
        return (num1 < num2) ? num1 : num2;
    }
}
