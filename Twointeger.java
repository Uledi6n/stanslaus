import java.util.Scanner;
public class Twointeger{
    public static void main(String[] args){
        Scanner twointeger=new Scanner(System.in);
        System.out.println("Enter two integer where rightmost must be non-zero: ");
        int x=twointeger.nextInt();
        
        int oneth=x%10;
        int tenth=x/10;
        
        int y=oneth*10+tenth;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("x+y= "+(x+y));
        
        
    
    }
}