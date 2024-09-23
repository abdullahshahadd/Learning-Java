import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
        System.out.println("Welcome to Array Searching\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("Your number was found.");
        } else {
            System.out.println("Not found.");
        }
    }

    public static boolean isFound (int[] arr, int num) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
