public class IsSortedArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        boolean isSortedAscending = isSortedAscending(array);
        boolean isSortedDescending = isSortedDescending(array);
        if (isSortedAscending) {
            System.out.println("It is sorted in ascending order.");
        } else {
            System.out.println("It is not sorted in ascending order.");
        }
        if (isSortedDescending) {
            System.out.println("It is sorted in descending order.");
        } else {
            System.out.println("It is not sorted in descending order.");
        }
    }

    public static boolean isSortedAscending(int[] array) {
        int min = array[0];
        int i = 1;
        while (i < array.length) {
            if (min > array[i]) {
                return false;
            } else {
                min = array[i];
            }
            i++;
        }
        return true;
    }

    public static boolean isSortedDescending(int[] array) {
        int max = array[0];
        int i = 1;
        while (i < array.length) {
            if (array[i] > max) {
                return false;
            } else {
                max = array[i];
            }
            i++;
        }
        return true;
    }
}
