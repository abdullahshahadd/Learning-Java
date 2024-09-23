public class PalindromeArray46 {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome checker\n");
        System.out.println("Enter the Array");
        int[] array = ArrayUtility.inputArray();
        boolean IsPalindrome = palindrome(array);
        if (IsPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    public static boolean palindrome(int[] array) {
        int i = 0;
        while (i < (array.length / 2)) {
            if (array[i] != array[(array.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
