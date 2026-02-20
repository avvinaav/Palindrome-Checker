class PalindromeCheckerApp{
    public static void main(String[] args) {
        // 1. Hardcoded string to check
        String original = "radar";
        String reversed = ""; // Initializing an empty string for reversal

        // 2. Loop (for loop) - Iterating backwards
        // We start at the last index (length - 1) and go to index 0
        for (int i = original.length() - 1; i >= 0; i--) {
            // 3. String Concatenation (+)
            // This builds the reversed string character by character
            reversed = reversed + original.charAt(i);
        }

        // 4. equals() Method - Compare content, not memory addresses
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: '" + original + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + original + "' is NOT a palindrome.");
        }
    }
}