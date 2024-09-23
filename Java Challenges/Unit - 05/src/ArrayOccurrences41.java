import java.util.Scanner;

public class ArrayOccurrences41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrence Check.");
        int [] array = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to check: ");
        int numCheck = input.nextInt();
        int occur = Occurrences(array, numCheck);
        System.out.println("Number of occurrences are: " + occur);
    }

    public static int Occurrences(int[] array, int num) {
        int occur = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == num) {
                occur++;
            }
            i++;
        }

        return occur;
    }
}
