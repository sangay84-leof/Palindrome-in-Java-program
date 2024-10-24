import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Convert the string to lowercase to make it case-insensitive
        input = input.toLowerCase();
        
        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = input.length() - 1;
        
        boolean isPalindrome = true;
        
        // Compare characters from start and end
        while (start < end) {
            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(input.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(input.charAt(end))) {
                end--;
            } else if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            } else {
                start++;
                end--;
            }
        }
        
        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
}
