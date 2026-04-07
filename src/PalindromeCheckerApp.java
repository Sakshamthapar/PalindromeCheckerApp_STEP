// UC7
public static void checkPalindromeUsingDeque() {
    String input = "refer";

    java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

    // Add characters to deque
    for (char c : input.toCharArray()) {
        deque.add(c);
    }

    boolean isPalindrome = true;

    // Compare front and rear
    while (deque.size() > 1) {
        if (deque.removeFirst() != deque.removeLast()) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("UC7 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC7 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}