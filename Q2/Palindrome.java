import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("Exiting program.");
                break;
            }

            if (isPalindrome(input)) {
                System.out.println("The string \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is not a palindrome.");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
