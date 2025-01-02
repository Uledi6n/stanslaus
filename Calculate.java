public class Calculate {
    public static void main(String[] args) {
        double annualSalary = 32500.00;
        double grosspermonth = annualSalary / 24;
        double grossPayBiWeekly = annualSalary / 26;
        System.out.printf("Gross pay per paycheck (twice a month): $%.2f\n", grosspermonth);
        System.out.printf("Gross pay per paycheck (bi-weekly): $%.2f\n", grossPayBiWeekly);
    }
}