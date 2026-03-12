import java.util.Scanner;


    public class UseCase3PalindromeCheckerApp {

        /**
         * Application entry point for UC3
         */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Get input from user
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Variable to store reversed string
            String reversed = "";

            // Iterate from last character to first
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }

            // Compare original and reversed string
            if (input.equals(reversed)) {
                System.out.println("The string is a Palindrome.");
            } else {
                System.out.println("The string is NOT a Palindrome.");
            }

            sc.close();
        }
    }

