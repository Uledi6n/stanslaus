
import java.util.Scanner;;
public class Rainfall{
	public static void main(String[] args) {
		Scanner rain=new Scanner(System.in);
		System.out.print("Enter number of year: ");
		int years=rain.nextInt();
		int totalrain=0;
		int totalmonth=1;
		for(int year=1;year<=years;year++) {
			System.out.print("\n YEAR "+year+":\n");
			String[] months= {
					"january","february","march","april","may","june","jully","august",
					"september","october","november","december"
			};
			for(int month=0;month<12;month++) {
				System.out.print("Enter amount of rainfall for "+months[month].toUpperCase()+": ");
				int amount=rain.nextInt();
				totalrain+=amount;
				totalmonth=months.length*years;
			}	
		}
		System.out.print("\nTOTAL MONTH FOR "+years+" years: "+totalmonth);
		System.out.print("\nTOTAL RAINFAL FOR "+years+" years: "+totalrain);
		System.out.print("\nTOTAL AVERAGES RAINFAL FOR "+years+" years: "+totalrain/totalmonth);
	}
}