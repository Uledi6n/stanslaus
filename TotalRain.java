import java.util.*;
public class TotalRain {
				
				public static void main(String[] args) {
								Scanner scanner =new Scanner(System.in);
								String[] arr={
												"January","February","march","April","may",
												"june","july","august","september","october",
												"november","december"
								};
								int amount=0;
								for (int b=0;b<arr.length;b++){
												System.out.print("Enter amount of rainfall of "+arr[b]+" :");
												double rainamount=scanner.nextDouble();
												amount+=rainamount;
												
								}
								System.out.println("Total rainfall of this year "+amount+" mm");
								System.out.println("Average rainfall of this year "+amount/12+" mm");
								
				}
				
}