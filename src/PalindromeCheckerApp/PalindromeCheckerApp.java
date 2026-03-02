public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Start time
        long startTime = System.nanoTime();

        // Palindrome logic
        boolean isPalindrome = checkPalindrome(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        // Output
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    private static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}