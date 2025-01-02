

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; 
        
        while (true) {
            System.out.print("Enter an integer (-99 to end): ");
            int number = scanner.nextInt();
            if (number == -99) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
            System.out.println("The largest number is: " + largest);
            System.out.println("The smallest number is: " + smallest);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
