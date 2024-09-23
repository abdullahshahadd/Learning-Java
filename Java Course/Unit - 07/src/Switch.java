import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to day of the week detector\n");
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();
        //oldSwitch(day);
        newSwitch(day);
    }

    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6, 7 -> "Holiday";
            default -> "Invalid";
        };
        System.out.println(dayStr);
    }

    /*public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Sunday!");
                break;
            case 2:
                System.out.println("Monday!");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6: // fall through
                // System.out.println("Friday");
                //break;
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }*/

}
