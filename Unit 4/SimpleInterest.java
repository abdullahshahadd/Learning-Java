import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int principle = input.nextInt();
        System.out.print("Enter Time: ");
        int time = input.nextInt();
        System.out.print("Enter Rate: ");
        float rate = input.nextFloat();

        float interest = (principle * time * rate) / 100;
        System.out.println("Interest: " + interest);
    }
}
