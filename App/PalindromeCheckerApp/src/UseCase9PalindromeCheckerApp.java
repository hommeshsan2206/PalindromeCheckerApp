/**
 * ============================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the start and end positions
 * moving inward using recursive calls.
 */

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "madam";

        // Call recursive method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    /**
     * Recursively checks whether a string is palindrome
     * @param s input string
     * @param start starting index
     * @param end ending index
     * @return true if palindrome otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }
}