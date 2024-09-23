import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number of elements in the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter your no. " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }

        return array;
    }

    public static void displayArray (int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        int[][] array2D = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Enter " + (i + 1) + " row " + (j + 1) + " column: ");
                array2D[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return array2D;
    }
}
