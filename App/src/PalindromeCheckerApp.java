import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp{
    public static void main(String[] args) {
        // 1. Hardcoded string
        String input = "noon";

        // 2. Initialize Data Structures
        // Note: Queue is an interface in Java, so we use LinkedList to implement it
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // 3. Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);   // Added to top
            queue.add(c);    // Added to back (Enqueue)
        }

        // 4. Logical Comparison (Dequeue vs Pop)
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            // pop() gets the LAST character, poll() gets the FIRST character
            if (stack.pop() != queue.poll()) {
                isPalindrome = false;
                break;
            }
        }

        // 5. Print Result
        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
    }
}