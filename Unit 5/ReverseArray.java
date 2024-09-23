public class ReverseArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        reverse(array);
        System.out.println("Your reversed array is: ");
        ArrayUtility.displayArray(array);
    }

    public static void reverse(int[] array) {
        int i = 0;
        while (i < array.length / 2) {
            int swap = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = swap;
            i++;
        }
    }
}
