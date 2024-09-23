import java.util.Scanner;

public class SkipOddNumbers67 {
    public static void main(String[] args) {
        int[] array = MaxArrayValueForEach63.InputArray();
        for (int num : array) {
            if (num % 2 != 0) {
                continue;
            }
            System.out.print(num + " ");
        }
    }
}
