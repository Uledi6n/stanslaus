public class Table{
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");
        int N = 1;
        while (N <= 5) { 
            System.out.println(N + "\t" + (10 * N) + "\t" + (100 * N) + "\t" + (1000 * N));
            N++;
        }
    }
}

