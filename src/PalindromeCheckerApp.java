// UC13
public static void comparePerformance() {
    String input = "level";

    // Using simple two-pointer logic
    long startTime = System.nanoTime();

    boolean isPalindrome = true;
    int start = 0;
    int end = input.length() - 1;

    while (start < end) {
        if (input.charAt(start) != input.charAt(end)) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    long endTime = System.nanoTime();

    long duration = endTime - startTime;

    System.out.println("UC13 Result: \"" + input + "\" is " +
            (isPalindrome ? "a Palindrome." : "NOT a Palindrome."));

    System.out.println("Execution Time: " + duration + " ns");
}