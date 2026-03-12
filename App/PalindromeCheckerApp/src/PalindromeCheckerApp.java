public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;

        // Loop till half of the string
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from both ends
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}

