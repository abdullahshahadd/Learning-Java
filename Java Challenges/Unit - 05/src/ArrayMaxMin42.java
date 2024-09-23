public class ArrayMaxMin42 {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        System.out.println("Max number is: " + ArrayMax(array));
        System.out.println("Min number is: " + ArrayMin(array));
    }


    public static int ArrayMax(int[] array) {
        int max = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] >= max) {
                max = array[i];
            }
            i++;
        }

        return max;
    }

    public static int ArrayMin(int[] array) {
        int min = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] <= min) {
                min = array[i];
            }
            i++;
        }

        return min;
    }
}
