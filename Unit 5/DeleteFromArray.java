import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        System.out.print("Enter the number you want to delete: ");
        int num = input.nextInt();
        int[] newArray = deleteNumber(array, num);
        System.out.println("Here is the new array: ");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteNumber(int[] array, int num) {
        int occ = ArrayOccurrence.occurrences(array, num);
        if (occ == 0) {
            return array;
        }
        int newSize = array.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < array.length) {
            if (array[i] != num) {
                newArr[j] = array[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
