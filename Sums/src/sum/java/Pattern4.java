package sum.java;

public class Pattern4 {

	public static void main(String[] args) {
		int r=1;
		do {
			int b=0;
			while(b<4-r)
			{
				b++;
				System.out.print(' ');
			}
			int c=0;
			while(c<r) 
			{
				c++;
				System.out.print(c);
			}
			r++;
			System.out.println();
		}while(r<5);

	}

}
