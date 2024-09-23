import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        tables(input.nextInt());
    }

    public static void tables(int num) {
        int i = 1;
        while (i <= 10) {
            int result = num * i;
            System.out.println(result);
            i++;
        }
    }
}
