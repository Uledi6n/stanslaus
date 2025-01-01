public class SavingsAccount {
    private static double annualInterestRate; // Static variable for annual interest rate
    private double savingsBalance; // Instance variable for savings balance

    // Constructor to initialize savings balance
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate monthly interest and update savings balance
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    // Method to get the current savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Main method to test the SavingsAccount class
    public static void main(String[] args) {
        // Create two savings account objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate and display balances after one month's interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver1 Balance after 4%% interest: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 Balance after 4%% interest: $%.2f%n", saver2.getSavingsBalance());

        // Set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate and display balances after next month's interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver1 Balance after 5%% interest: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 Balance after 5%% interest: $%.2f%n", saver2.getSavingsBalance());
    }
}
