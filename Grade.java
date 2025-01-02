import java.util.Scanner;
public class Grade{
	public static void main(String[] args) {
		Scanner grade=new Scanner(System.in);
		System.out.print("select your score(0/1/2/3/4/5): ");
		String score=grade.nextLine();
		
		if(score.equals("5")) {
			System.out.println("You have score "+score+" Grade A");
		}else if(score.equals("4")) {
			System.out.println("You have score "+score+" Grade B");
		}else if(score.equals("3")) {
			System.out.println("You have score "+score+" Grade C");
		}else if(score.equals("2")) {
			System.out.println("You have score "+score+" Grade D");
		}else if(score.equals("1") || score.equals("0")) {
			System.out.println("You have score "+score+" Grade F");
		}else {
			System.out.println("i'm not did a quizz");
		}
	}
}