import java.util.Scanner;
public class Us_eligible{
	public static void main(String[] args) {
		Scanner eligible=new Scanner(System.in);
		System.out.println("Enter your age:");
		int liveage=eligible.nextInt();
		
		System.out.println("Enter your age of citizenship:");
		int citizenage=eligible.nextInt();
		
		if(liveage>=30 && citizenage>=9) {
			System.out.println("You are eligible to be senator");
		}else if(liveage<30 && citizenage<9) {
			if(liveage>=25 && citizenage>=7) {
				System.out.println("You are eligible to be representative");	
			}else {
				System.out.println("You are not eligible to be representative");
			}
			
		}else {
			System.out.println("You are not eligible to be senator");
		}		
	}
}