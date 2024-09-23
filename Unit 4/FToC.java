import java.util.Scanner;

public class FToC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        int temp = input.nextInt();

        int celsius = (temp - 32) * 5 / 9;
        System.out.println("Temp in Celsius: " + celsius);
    }
}
