import java.util.Stack;
class PalindromeCheckerApp{
    public static void main(String[] args) {
        // 1. Hardcoded string
        String input = "level";

        // 2. Data Structure: Stack
        // We use a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // 3. Push Operation
        // Push each character of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // 4. Pop and Reversal Logic
        String reversed = "";
        while (!stack.isEmpty()) {
            // Pop removes the top element (the last one pushed)
            reversed += stack.pop();
        }

        // 5. Compare and Print Result
        if (input.equals(reversed)) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
    }
}