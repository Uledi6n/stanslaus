import java.util.Scanner;
public class Seriesnum{
	public void series() {
		Scanner seriesno=new Scanner(System.in);
		int sumNO=0;
		for(int x=1;x>0;x++) {
			System.out.print("Enter series of number "+x+": ");
			int number=seriesno.nextInt();
			sumNO+=number;
			if (number<0) {
				System.out.println("\n THE SUM OF ALL NUMBERS ARE: "+sumNO);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Seriesnum num=new Seriesnum();
		num.series();
	}
}

