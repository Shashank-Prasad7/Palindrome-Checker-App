import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Program starts");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();

    }
}