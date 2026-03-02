import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {

        // Define input string
        String input = "level";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare front and rear
        while (list.size() > 1) {

            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}