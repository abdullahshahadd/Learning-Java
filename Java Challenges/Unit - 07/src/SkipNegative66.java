import java.util.Scanner;

public class SkipNegative66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = MaxArrayValueForEach63.InputArray();
        System.out.println("Sum: " + SumOfPositive(array));

    }

    public static int SumOfPositive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        return sum;
    }

}
