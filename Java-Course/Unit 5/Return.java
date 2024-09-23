import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println(sum);
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        return input.nextInt();
    }

    public static void greet() {
        System.out.println("Welcome to calculatior\n");
    }
}
