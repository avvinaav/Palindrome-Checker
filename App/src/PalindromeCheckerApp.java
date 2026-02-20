class PalindromeCheckerApp{
    public static void main(String[] args) {
        // 1. Hardcoded string
        String input = "deified";

        // 2. Convert string to Character Array (char[])
        char[] charArray = input.toCharArray();

        // 3. Initialize Two Pointers
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        // 4. Two-Pointer Comparison Logic
        while (left < right) {
            // Compare characters at current pointers
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Optimization: Exit loop early if a mismatch is found
            }
            left++;  // Move front pointer forward
            right--; // Move back pointer backward
        }

        // 5. Display result
        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
    }
    }
}