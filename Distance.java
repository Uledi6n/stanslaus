import java.util.Scanner;
public class Distance{
	public static void main(String[] args) {
		Scanner distance=new Scanner(System.in);
		System.out.print("Enter the speed your vehicle: ");
		int speed=distance.nextInt();
		System.out.print("Enter the hour traveled by your vehicle: ");
		int hours=distance.nextInt();
		
		System.out.println("hour"+"\t"+"speed"+"\t"+"distance(miles/hr)");
		
		for(int hour=1;hour<=hours;hour++) {
			int distances=speed*hour;
			System.out.println(hour+"\t"+speed+"\t"+distances);
		}
		
	}
}