
import java.util.Scanner;

public class AttendanceList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        if (numStudents <= 0) {
            System.out.println("The number of students must be positive.");
            return;
        }
        String[] studentNames = new String[numStudents];
        System.out.println("Enter the names of the students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();
        }
        System.out.println("\nAttendance List:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + ". " + studentNames[i]);
        }

        scanner.close();
    }
}
