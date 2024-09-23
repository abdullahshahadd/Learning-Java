public class MergeSortedArrays47 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Merger\n");
        System.out.println("Enter your first array");
        int[] array1 = ArrayUtility.inputArray();
        System.out.println("Enter your second array");
        int[] array2 = ArrayUtility.inputArray();
        int[] newArray = ArrayMerger(array1, array2);
        System.out.println("Here is the merged array: ");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] ArrayMerger(int[] array1, int[] array2) {
        int size = array1.length + array2.length;
        int[] newArray = new int[size];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length || j < array2.length) {
            if (j == array2.length ||
                    (i < array1.length && array1[i] < array2[j])) {
                newArray[k] = array1[i];
                i++;
            } else {
                newArray[k] = array2[j];
                j++;
            }
            k++;
        }

        return newArray;
    }
}
