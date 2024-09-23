public class SumAverage2DArray {
    public static void main(String[] args) {
        int [][] array = ArrayUtility.input2DArray();
        long sum = sum(array);
        double average = average(array);
        System.out.println("Here is the sum: " + sum);
        System.out.println("Here is the average: "  + average);
    }

    public static long sum(int[][] array) {
        if (array.length == 0) {
            return 0;
        }
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

    public static double average(int[][] array) {
        long sum = sum(array);
        int number = 0;
        int i = 0;
        while (i < array.length) {
            int j = 0;
            while (j < array[i].length) {
                number++;
                j++;
            }
            i++;
        }
        return (double) sum / number;
    }
}
