// UC5
public static void checkPalindromeUsingStack() {
    String input = "noon";

    java.util.Stack<Character> stack = new java.util.Stack<>();

    // Push characters into stack
    for (char c : input.toCharArray()) {
        stack.push(c);
    }

    boolean isPalindrome = true;

    // Pop and compare
    for (char c : input.toCharArray()) {
        if (c != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("UC5 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC5 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}