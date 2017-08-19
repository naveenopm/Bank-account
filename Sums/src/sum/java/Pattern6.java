package sum.java;

public class Pattern6 {

	public static void main(String[] args) {
		int r=1;
		do {
			int c=1;
			while(c<r)
			{
				c++;
				System.out.print(' ');
			}
			int b=5;
			while(b>r)
			{   
				b--;
				System.out.print(b);
			}
			r++;
			System.out.println();
		}while(r<5);

	}

}
