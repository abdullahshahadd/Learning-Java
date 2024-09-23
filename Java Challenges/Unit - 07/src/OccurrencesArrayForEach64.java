import java.util.Scanner;

public class OccurrencesArrayForEach64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number your want to check: ");
        int num = input.nextInt();
        int[] array = MaxArrayValueForEach63.InputArray();
        System.out.println("Occurrences: " + Occurrences(array, num) + " times");
    }

    public static int Occurrences(int [] array, int num) {
        int occur = 0;
        for (int digits : array) {
            if (digits == num) {
                occur++;
            }
        }
        return occur;
    }
}
