import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ============================================================
 * Use Case 6: Queue + Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using two data structures:
 * Queue (FIFO) and Stack (LIFO).
 */

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);     // enqueue
            stack.push(c);    // push
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare dequeue and pop characters
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}