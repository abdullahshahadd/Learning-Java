import java.util.Scanner;

public class Search2DArray48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to search in 2D Array\n");
        int[][] array2D = ArrayUtility.input2DArray();
        System.out.print("Enter the number you want to search for: ");
        int num = input.nextInt();
        boolean isFound = search2DArray(array2D, num);
        if (isFound) {
            System.out.println("Number is found.");
        } else {
            System.out.println("Number is not found.");
        }
    }

    public static boolean search2DArray(int[][] array, int num) {
        int i = 0;
        while (i < array.length) {
            int j = 0;
            while (j < array[i].length) {
                if (array[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
