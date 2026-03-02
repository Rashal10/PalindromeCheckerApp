public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "level";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

interface PalindromeStrategy {

    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create stack
        java.util.Stack<Character> stack =
                new java.util.Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with popped values
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}