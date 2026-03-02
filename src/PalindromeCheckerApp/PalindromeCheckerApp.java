public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {

        // Define input string
        String input = "Never Odd Or Even";

        // Normalize string (lowercase + remove spaces)
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Assume palindrome
        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
