import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();
 
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
    }
}
