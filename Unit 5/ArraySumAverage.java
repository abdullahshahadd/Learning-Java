import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Sum: " + sum(numArray));
        System.out.println("Average: " + average(numArray));
    }

    public static double average(int[] nums) {
        long sum = sum(nums);
        return (double) sum / nums.length;
    }

    public static long sum(int[] nums) {
        long sum = 0;
        int i = 0;
        while (i < nums.length) {
            sum += nums[i];
            i++;
        }
        return sum;
    }
}
