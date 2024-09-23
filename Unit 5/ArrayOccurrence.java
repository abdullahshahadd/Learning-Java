import java.util.Scanner;

public class ArrayOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        System.out.print("Enter your number to check: ");
        int number = input.nextInt();
        System.out.println("Number of occurrences: " + occurrences(array, number));
    }

    public static int occurrences(int [] array, int number) {
        int occur = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                occur ++;
            }
            i++;
        }
        return occur;
    }
}
