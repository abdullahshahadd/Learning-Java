import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < nums.length) {
            System.out.print("Enter your no. " + (i + 1) + " number: ");
            nums[i] = input.nextInt();
            i++;
        }
        return  nums;
    }

    public static void displayArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = input.nextInt();
        int [][] numArray = new int[rows][column];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < column) {
                System.out.print("Enter element row: " + (i + 1) + ", column: " + (j + 1) + " : ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
}
