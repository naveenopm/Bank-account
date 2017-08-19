package sum.java;

public class Pattern3 {

	public static void main(String[] args) {
		int r=1;
		do {
			int b=0;
			while(b<4-r)
			{
				System.out.print(' ');
				b++;
			}
			int d=0;
			while(d<r) 
			{
				System.out.print(r);
				d++;
			}
			r++;
			System.out.println();
		}while(r<5);

	}

}
