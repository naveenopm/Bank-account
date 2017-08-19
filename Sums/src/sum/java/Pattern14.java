package sum.java;

public class Pattern14 {

	public static void main(String[] args) {
		int r=1;
		do {
			int b=0;
			while(b<3-r)
			{
				System.out.print(" ");
				b++;
			}
			int c=0;
			while(c<r)
			{
				c++;
				System.out.print("*");
				System.out.print(" ");
			}
			r++;
			System.out.println();
		}while(r<4);

	}

}
