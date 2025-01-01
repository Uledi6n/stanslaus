import java.util.Scanner;
abstract class Clothes{
    public abstract void Clothesbrand();
    public void Color(){
        Scanner scan=new Scanner(System.in);
        String[] color={"red","blue","green","white","black"};
        System.out.print("Enter color of your cloth : ");
        String clothcolor=scan.nextLine().toLowerCase();
        
        
        if(color[0].toLowerCase()==clothcolor){
            System.out.println(color[0]);
        }else{
            System.out.println("does not match");
        }
        
    }
    
}
class Shop extends  Clothes{
    public void Clothesbrand(){
        System.out.println("brandname\n\tULEDI STANSLAUS");
    }
    public void body(){
        System .out.println("WELCOME TO ULED SHOP");
        System.out.println("This is our price of the clothes");
        
    }
}
class Abstract {
    public static void main(String[] args){
        Shop myshop =new Shop();
        myshop.Clothesbrand();
        myshop.body();
        myshop.Color();
    }
    
}