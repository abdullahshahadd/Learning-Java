public class ArraySorted43 {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        ArrayUtility.displayArray(array);
        System.out.println();
        if (array[0] <= array[1]) {
            if (arrayAscending(array)) {
                System.out.println("Array is sorted and is in Ascending order");
            } else {
                System.out.println("Array is not sorted");
            }
        } else {
            if (arrayDescending(array)) {
                System.out.println("Array is sorted and is in Descending order");
            } else {
                System.out.println("Array is not sorted");
            }
        }
    }

    public static boolean arrayAscending(int[] array) {
        boolean isAscending = false;
        int i = 0;
        int j = 1;
        while (j <= array.length - 1) {
            if (array[i] <= array[j]) {
                isAscending = true;
            } else {
                return false;
            }
            i++;
            j++;
        }

        return isAscending;
    }

    public static boolean arrayDescending(int[] array) {
        boolean isDescending = false;
        int i = 0;
        int j = 1;
        while (j <= array.length - 1) {
            if (array[i] >= array[j]) {
                isDescending = true;
            } else {
                return false;
            }
            i++;
            j++;
        }

        return isDescending;
    }
}
