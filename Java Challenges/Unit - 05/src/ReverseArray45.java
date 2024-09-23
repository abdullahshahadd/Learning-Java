public class ReverseArray45 {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Array\n");
        System.out.println("Enter an array to reverse: ");
        int[] array = ArrayUtility.inputArray();
        reverse(array);
        System.out.println("Here is the reversed array: ");
        ArrayUtility.displayArray(array);
    }

   /* public static int[] reverseArray(int[] array) {
            // Method - 1

        int size = array.length;
        int[] newArray = new int[size];
        int i = array.length - 1;
        int j = 0;
        while (i >= 0) {
            newArray[j] = array[i];
            j++;
            i--;
        }

        return newArray;
    }*/

    public static void reverse(int[] array) {
                // Method - 02
        int i = 0;
        while (i < array.length / 2) {
            int swap = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = swap;
            i++;
        }
    }
}
