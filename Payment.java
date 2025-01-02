import java.util.Scanner;
public class Payment{
	public static void main(String[] args) {
		Scanner pay=new Scanner(System.in);
		
		System.out.print("Enter ID number: ");
		int id=pay.nextInt();		
		System.out.print("Enter working hour: ");
		int hr=pay.nextInt();
		System.out.print("Enter your payment per hour: ");
		int phr=pay.nextInt();
		
		int total=(40*phr);
		int overhr=(hr-40);
		double gross=(total+(overhr*phr*1.5));
		int paying=hr*phr;

		if (hr>=40) {
			System.out.println("overtime that you work is "+overhr+"hours");
			System.out.println("your gross pay1 is "+gross+" Tsh");
		}else {
			System.out.println("your gross pay2 is "+ paying+" Tsh");
		}
		
		if (gross>500 || paying>500) {
			double deduction=(0.15*gross);
			double netpay=gross-deduction;
		    System.out.println("your net pay is "+netpay+" Tsh");
		}
	}
}