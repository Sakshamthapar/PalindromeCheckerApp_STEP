// UC10
public static void checkPalindromeNormalized() {
    String input = "A man a plan a canal Panama";

    // Step 1: Normalize (remove spaces & symbols, lowercase)
    String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

    boolean isPalindrome = true;

    // Step 2: Check palindrome
    for (int i = 0; i < normalized.length() / 2; i++) {
        if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("UC10 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC10 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}