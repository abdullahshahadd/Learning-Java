public class ArraySumAverage40 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum & Average");
        int[] array =  ArrayUtility.inputArray();
        System.out.println("Sum is: " + arraySum(array));
        System.out.println("Average is: " + arrayAverage(array));
    }

    public static long arraySum(int[] array) {
        long sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        return sum;
    }

    public static double arrayAverage(int[] array) {
        double sum = arraySum(array);
        return sum / (array.length);
    }
}