import java.util.Objects;
import java.util.Scanner;

public class BreakLoop65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Enter your word: ");
            String word = input.next();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}
