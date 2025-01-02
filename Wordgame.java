import java.util.Scanner;
public class Wordgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        String age = scanner.nextLine();
        System.out.println("Enter the name of a city: ");
        String city = scanner.nextLine();
        System.out.println("Enter the name of a college: ");
        String college = scanner.nextLine();
        System.out.println("Enter your profession: ");
        String profession = scanner.nextLine();
        
        System.out.print("Enter the name of an animal: ");
        String animal = scanner.nextLine();
        
        System.out.println("Enter your pet's name: ");
        String petName = scanner.nextLine();
        
        String story = String.format(
            "There once was a person named %s who lived in %s.\n" +
            "At the age of %s, %s went to college at %s.\n" +
            "%s graduated and went to work as a %s.\n" +
            "Then, %s adopted a(n) %s named %s.\n" +
            "They both lived happily ever after!", 
            name, city, age, name, college, name, profession, name, animal, petName);
        
        System.out.println(story);
    }
}
