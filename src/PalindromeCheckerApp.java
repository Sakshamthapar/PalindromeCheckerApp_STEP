// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}
// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
// UC12
public static void checkPalindromeUsingStrategy() {
    String input = "level";

    // Choose strategy dynamically
    PalindromeStrategy strategy;

    // You can change strategy here
    strategy = new StackStrategy();
    // strategy = new DequeStrategy();

    boolean result = strategy.check(input);

    if (result) {
        System.out.println("UC12 Result: \"" + input + "\" is a Palindrome.");
    } else {
        System.out.println("UC12 Result: \"" + input + "\" is NOT a Palindrome.");
    }
}