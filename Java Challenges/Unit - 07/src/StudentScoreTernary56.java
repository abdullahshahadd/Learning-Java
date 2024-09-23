import java.util.Scanner;

public class StudentScoreTernary56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Score: ");
        float mark = input.nextFloat();
        String result = (mark > 80) ? "High" : (mark >= 50) ? "Moderate" : "Low";
        System.out.println(result);
    }
}
