import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length A: ");
        float a = input.nextFloat();
        System.out.print("Enter length B: ");
        float b = input.nextFloat();
        System.out.print("Enter length C: ");
        float c = input.nextFloat();
        System.out.print("Enter length D: ");
        float d = input.nextFloat();

        float perimeter = a + b + c +d;
        System.out.println("Perimeter: " + perimeter);
    }
}
