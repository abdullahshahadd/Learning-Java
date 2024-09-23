import java.util.Scanner;

public class DeleteSpecificArray44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArray = deleteNumber(array, numToDelete);
        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteNumber(int[] array, int num) {
        int occur = ArrayOccurrences41.Occurrences(array, num);
        if (occur == 0) {
            return array;
        }
        int newSize = array.length - occur;
        int[] newArray = new int[newSize];
        int i = 0, j = 0;
        while (i < array.length) {
            if (array[i] != num) {
                newArray[j] = array[i];
                j++;
            }
            i++;
        }

        return newArray;
    }
}
