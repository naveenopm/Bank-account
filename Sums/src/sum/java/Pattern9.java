package sum.java;

public class Pattern9 {

	public static void main(String[] args) {
		int r=0,c=4;
		do {
			int b=0;
			while(b<r)
			{
				
				System.out.print(' ');
				b++;
			}
			int d=0;
			while(d<4-r) 
			{
				System.out.print(c);
				d++;
			}
			r++;
			c--;
			System.out.println();
		}while(r<5);

	}

}