public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        showWelcomeMessage();

        // ===== UC2 =====
        checkHardcodedPalindrome();

        // ===== UC3 =====
        checkPalindromeUsingReverse();
    }

    // UC1
    public static void showWelcomeMessage() {
        System.out.println("========================================");
        System.out.println(" Welcome to the Palindrome Checker App ");
        System.out.println("========================================");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.\n");
    }

    // UC2
    public static void checkHardcodedPalindrome() {
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC2 Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("UC2 Result: \"" + input + "\" is NOT a Palindrome.");
        }
    }

    // UC3
    public static void checkPalindromeUsingReverse() {
        String input = "madam";
        String reversed = "";

        // reverse string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // compare
        if (input.equals(reversed)) {
            System.out.println("UC3 Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("UC3 Result: \"" + input + "\" is NOT a Palindrome.");
        }
    }
}
// UC4
public static void checkPalindromeUsingCharArray() {
    String input = "radar";

    char[] chars = input.toCharArray();

    int start = 0;
    int end = chars.length - 1;

    boolean isPalindrome = true;

    while (start < end) {
        if (chars[start] != chars[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    if (isPalindrome) {
        System.out.println("UC4 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC4 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}