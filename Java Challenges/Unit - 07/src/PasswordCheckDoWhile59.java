import java.util.Objects;
import java.util.Scanner;

public class PasswordCheckDoWhile59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Password: ");
        String pass = input.next();

        String passCheck;
        do {
            System.out.print("Enter the password to check: ");
            passCheck = input.next();
        } while (!passCheck.equals(pass));
        System.out.println("Correct");
    }
}