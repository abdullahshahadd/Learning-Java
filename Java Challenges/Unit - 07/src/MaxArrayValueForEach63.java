import java.util.Scanner;

public class MaxArrayValueForEach63 {
    public static void main(String[] args) {
        System.out.println("Enter your array: ");
        int[] array = InputArray();
        System.out.println("Max value: " + MaxValueArray(array));
    }

    public static int[] InputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter your number: ");
            array[i] = input.nextInt();
        }

        return array;
    }

    public static int MaxValueArray(int[] array) {
        int maxVal = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        return maxVal;
    }
}
