import java.util.Scanner;
public class Runners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[3];
        double[] times = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of runner " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter the time (in minutes) it took " + names[i] + " to finish the race: ");
            times[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (times[i] > times[j]) {
                    double tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        System.out.println("\nRace Results:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + times[i] + " minutes");
        }
    }
}
