import java.util.Scanner;
class RestOwner {
    private String name;
    private String[] dessertList;

    public RestOwner(String name, String[] dessertList) {
        this.name = name;
        this.dessertList = dessertList;
    }
    public String getOwnerName() {
        return name;
    }
    public String[] getDessertList() {
        return dessertList;
    }
    public void setOwnerName(String name) {
        this.name = name;
    }
    public void setDessertList(String[] dessertList) {
        this.dessertList = dessertList;
    }
}
class MyRestaurant {
    private String restName;
    private String restAddress;
    private String[] menu;

    public MyRestaurant(String restName, String restAddress, String[] menu) {
        this.restName = restName;
        this.restAddress = restAddress;
        this.menu = menu;
    }
    public String getRestName() {
        return restName;
    }
    public String getRestAddress() {
        return restAddress;
    }
    public String[] getMenu() {
        return menu;
    }
    public void setRestName(String restName) {
        this.restName = restName;
    }
    public void setRestAddress(String address) {
        this.restAddress = address;
    }
    public void setMenu(String[] menu) {
        this.menu = menu;
    }
}
public class Restaurant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the owner name: ");
        String name = scan.nextLine().toUpperCase();
        String[] dessertList = {"mangoes", "avocadoes", "oranges", "apples", "pineapples", "tomatoes"};
        RestOwner restOwner = new RestOwner(name, dessertList);

        System.out.println("\nOWNER NAME: " + restOwner.getOwnerName());
        System.out.println(restOwner.getOwnerName() + "'s DESSERT LIST PER DAY:");
        int a = 0;
        for (String x : dessertList) {
            a++;
            System.out.println("\t" + a + ". " + x);
        }
        String restName = "STANSLAUS DELICIOUS MEAL";
        String restAddress = "located at:\n\t\tKAGEZI-KOBONDO\n\t\tP.O.Box 43\n\t\tKIGOMA-TANGANYIKA";
        String[] menu = {"Chips", "kuku", "wali", "maharage", "samaki (migebuka)", "matunda", "vinywaji"};
        MyRestaurant myRestaurant = new MyRestaurant(restName, restAddress, menu);

        System.out.println("\nRESTAURANT NAME:\t\n " + myRestaurant.getRestName());
        System.out.println("\tADDRESS OF OUR RESTAURANT\n\t" + myRestaurant.getRestAddress() + "\n");
        System.out.println("THIS IS THE LIST OF DELICIOUS MEALS PROVIDED BY:\n\t" + myRestaurant.getRestName());
        int c = 0;
        for (String m : menu) {
            c++;
            System.out.println("\t" + c + ". " + m);
        }
        System.out.println("\nDO YOU WANT TO ORDER DELICIOUS MEAL (yes/no)???");
        String response = scan.nextLine().toUpperCase();

        if (response.equals("YES")) {
            System.out.println("HOW MANY YOU WANT TO ORDER??:");
            int num = scan.nextInt();
            scan.nextLine();
            String[] orders = new String[num];

            for (int i = 0; i < num; ++i) {
                System.out.print("\nMeal you want " + (i + 1) + ": ");
                orders[i] = scan.nextLine();
            }

            System.out.println("\n\tLIST OF ORDERS MADE BY CUSTOMER");
            for (int b = 0; b < num; b++) {
                System.out.println((b + 1) + ". " + orders[b]);
            }
            System.out.println("THANKS FOR MAKING THIS ORDER.");
        } else {
            System.out.println("THANKS, WELCOME AGAIN.");
        }
        scan.close();
    }
}
