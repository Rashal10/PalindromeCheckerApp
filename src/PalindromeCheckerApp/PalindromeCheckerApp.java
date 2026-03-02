import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}