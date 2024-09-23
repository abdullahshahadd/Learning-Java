import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        float base = input.nextFloat();
        System.out.print("Enter height of triangle: ");
        float height = input.nextFloat();

        float area = 0.5f * base * height;
        System.out.println("Area: " + area);
    }
}
