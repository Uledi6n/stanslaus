import java.util.Scanner;

public class Taxcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the actual value of the property: $");
        double actualValue = scanner.nextDouble();
        System.out.print("Enter the tax rate (per $100 of assessed value): $");
        double taxRate = scanner.nextDouble();
        double assessedValue = actualValue * 0.60;
        double annualTax = (assessedValue / 100) * taxRate;
        
        System.out.printf("The assessed value of the property is: $%.2f\n", assessedValue);
        System.out.printf("The annual property tax is: $%.2f\n", annualTax);
    }
}