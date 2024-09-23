import java.util.Scanner;

public class CircleAreaCircumference72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = input.nextFloat();
        System.out.printf("Area: %f\n", CircleArea(radius));
        System.out.printf("Circumference: %f", CircleCircumference(radius));
    }

    public static float CircleArea(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public static float CircleCircumference(float radius) {
        return (float) (2 * Math.PI * radius);
    }
}
