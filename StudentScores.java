
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("Number of students must be positive.");
            return;
        }
        int[] scores = new int[numStudents];
        System.out.println("Enter the scores of students (0-100):");
        for (int i = 0; i < numStudents; i++) {
            while (true) {
                System.out.print("Score of student " + (i + 1) + ": ");
                int score = scanner.nextInt();
                if (score >= 0 && score <= 100) {
                    scores[i] = score;
                    break;
                } else {
                    System.out.println("Invalid score! Please enter a value between 0 and 100.");
                }
            }
        }
        int above80 = 0, between50And80 = 0, below50 = 0;
        for (int score : scores) {
            if (score > 80) {
                above80++;
            } else if (score >= 50) {
                between50And80++;
            } else {
                below50++;
            }
        }
        System.out.println("\nSummary of Scores:");
        System.out.println("Students with scores greater than 80%: " + above80);
        System.out.println("Students with scores between 50% and 80%: " + between50And80);
        System.out.println("Students with scores below 50%: " + below50);

        scanner.close();
    }
}
