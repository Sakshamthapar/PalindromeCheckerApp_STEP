// UC8
public static void checkPalindromeUsingLinkedList() {
    String input = "level";

    // Create LinkedList
    java.util.LinkedList<Character> list = new java.util.LinkedList<>();

    // Add characters
    for (char c : input.toCharArray()) {
        list.add(c);
    }

    boolean isPalindrome = true;

    // Compare first and last
    while (list.size() > 1) {
        if (list.removeFirst() != list.removeLast()) {
            isPalindrome = false;
            break;
        }
    }

    if (isPalindrome) {
        System.out.println("UC8 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC8 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}