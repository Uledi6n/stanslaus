
public class Math_table{
	public static void main(String[] args) {
		for(int n=1;n<=7;n++) {
			System.out.print(n+"\t");
		}
		for(int r=2;r<=10;r++) {
			System.out.print(r+"\n");
			for(int w=1;w<=7;w++) {
				System.out.print(w*r+"\t");
			}
		}
	}
}
