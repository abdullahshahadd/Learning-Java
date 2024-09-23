import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle = input.nextInt();
        System.out.print("Enter Time: ");
        int time = input.nextInt();
        System.out.print("Enter Rate: ");
        float rate = input.nextFloat();

        double interest = principle * Math.pow((1 + rate / 100), time);
        System.out.println("Interest: " + interest);
    }
}
