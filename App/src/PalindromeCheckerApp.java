import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp{
    public static void main(String[] args) {
        // 1. Hardcoded string
        String input = "rotator";

        // 2. Data Structure: Deque
        // ArrayDeque is a highly efficient implementation of the Deque interface
        Deque<Character> deque = new ArrayDeque<>();

        // 3. Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // 4. Comparison Logic (Remove First & Last)
        boolean isPalindrome = true;

        // We continue as long as there are at least 2 characters to compare
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // 5. Display Result
        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
    }
}