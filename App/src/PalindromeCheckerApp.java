class PalindromeCheckerApp{
    public static void main(String[] args) {
        String input = "deified";
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; 
            }
            left++;  
            right--; 
        }

        if (isPalindrome) {
            System.out.println("Result: '" + input + "' is a palindrome.");
        } else {
            System.out.println("Result: '" + input + "' is NOT a palindrome.");
        }
    }
    }
}
