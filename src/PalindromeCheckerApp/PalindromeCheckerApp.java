public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "radar";

        // Convert string into character array
        char[] chars = input.toCharArray();

        // Initialize pointers
        int start = 0;
        int end = chars.length - 1;

        // Assume palindrome
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}