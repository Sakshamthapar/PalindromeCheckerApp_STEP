// UC6
public static void checkPalindromeUsingQueueAndStack() {
    String input = "civic";

    java.util.Queue<Character> queue = new java.util.LinkedList<>();
    java.util.Stack<Character> stack = new java.util.Stack<>();

    // Add characters to both queue and stack
    for (char c : input.toCharArray()) {
        queue.add(c);   // FIFO
        stack.push(c);  // LIFO
    }

    boolean isPalindrome = true;

    // Compare dequeue vs pop
    while (!queue.isEmpty()) {
        if (queue.remove() != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("UC6 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC6 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}