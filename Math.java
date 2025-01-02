public class Math{
    public static void main(String[] args) {
        int N = 1;

        System.out.println("Mathematical Tables from 1 to 7:");

        // Print column headers
        System.out.print("\t");
        while (N <= 7) {
            System.out.print("N=" + N + "\t");
            N++;
        }
        //System.out.println();

        
        N = 1;

        // Print rows for the table
        int i = 1;
        while (i <= 10) {
            System.out.print(i + "\t");
            N = 1;
            while (N <= 7) {
                System.out.print((N * i) + "\t");
                N++;
            }
            //System.out.println();
            i++;
        }
    }
}