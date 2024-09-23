public class SumAverage2DArray49 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array Sum & Average\n");
        System.out.println("Enter the 2D Array");
        int[][] array = ArrayUtility.input2DArray();
        double average = average2DArray(array);
        long sum = sum2DArray(array);
        System.out.println("The Sum is: " + sum);
        System.out.println("The Average is: " + average);
    }

    public static long sum2DArray(int[][] array) {
        long sum = 0;
        int i = 0;
        while (i < array.length) {
            int j = 0;
            while (j < array[i].length) {
                sum += array[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }

    public static double average2DArray(int[][] array) {
        long sum = sum2DArray(array);
        int nums = 0;
        int i = 0;
        while (i < array.length) {
            int j = 0;
            while (j < array[i].length) {
                nums++;
                j++;
            }
            i++;
        }

        return (double) sum / nums;
    }
}
