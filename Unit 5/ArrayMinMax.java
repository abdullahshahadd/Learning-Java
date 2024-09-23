public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        System.out.println("Min value is: " + min(array));
        System.out.println("Max value is: " + max(array));
    }

    public static int max(int [] array) {
        if (array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        return min;
    }
}
