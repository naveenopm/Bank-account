package sum.java;

public class Pattern8 {

	public static void main(String[] args) {
		int r=0,c=4;
		do {
			int b=0;
			while(b<4-r)
			{
				
				System.out.print(c);
				b++;
			}
			r++;
			c--;
			System.out.println();
		}while(r<5);

	}

}
