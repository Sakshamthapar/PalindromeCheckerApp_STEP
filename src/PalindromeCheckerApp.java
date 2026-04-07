// UC9
public static void checkPalindromeUsingRecursion() {
    String input = "madam";

    boolean isPalindrome = isPalindromeRecursive(input, 0, input.length() - 1);

    if (isPalindrome) {
        System.out.println("UC9 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC9 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}

// Recursive function
public static boolean isPalindromeRecursive(String s, int start, int end) {

    // Base condition
    if (start >= end) {
        return true;
    }

    // Check mismatch
    if (s.charAt(start) != s.charAt(end)) {
        return false;
    }

    // Recursive call
    return isPalindromeRecursive(s, start + 1, end - 1);
}