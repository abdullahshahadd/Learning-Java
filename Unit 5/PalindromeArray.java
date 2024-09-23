public class PalindromeArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        boolean isPalindrome = isPalindrome(array);
        if (isPalindrome) {
            System.out.println("Is palindrome.");
        } else {
            System.out.println("Not palindrome.");
        }
    }

    public static boolean isPalindrome(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
