import java.util.Scanner;
public class Reverse{
	public void reverse() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter two digits with none zero on the rightmost: ");
		int x=scanner.nextInt();
		
		int ones=x%10;
		int tens=x/10;
		int y=ones*10+tens;
		int sum=x+y;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("x+y ="+sum);
		
	}
	public static void main(String[] args) {
		Reverse num=new Reverse();
		num.reverse();
	}
}