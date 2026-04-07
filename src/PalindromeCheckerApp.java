public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ===== UC1: Welcome Message =====
        System.out.println("========================================");
        System.out.println(" Welcome to the Palindrome Checker App ");
        System.out.println("========================================");

        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.\n");


        // ===== UC2: Hardcoded Palindrome Check =====
        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}