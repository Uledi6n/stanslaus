import java.util.*;
public class SeriesNo {
				public void series(){
								Scanner scan=new Scanner(System.in);
								
								System.out.print("How many number: ");
								int n=scan.nextInt();
								double total=0;	
								double[] num=new double[n];
								for (int a=0;a<n;++a){
												
												System.out.print("Enter number "+(a+1)+":");
												num[a]=scan.nextDouble();
												total+=num[a];
								}
								double low=num[0];
								double high=num[0];
								
								for (double no:num){
												if(no<=low) {
																low=no;
				        }
								    if(no>high){
								    				high=no;
								    }			
								}
								System.out.println("\n\n-----------------------------");
								System.out.println("The lowest number is "+low);
								System.out.println("The highest number is "+high);
								System.out.println("Total number is "+total);
								System.out.println("Average number is "+total/n);
				}
				
				public static void main(String[] args) {
								SeriesNo obj=new SeriesNo();
								obj.series();
								
				}
				
}