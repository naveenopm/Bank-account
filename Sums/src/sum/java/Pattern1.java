package sum.java;

public class Pattern1 {

	public static void main(String[] args) {
		int r=1;
		do {
			int b=0;
			while(b<r)
			{
				System.out.print(r);
				b++;
			}
			r++;
			System.out.println();
		}while(r<5);

	}

}
