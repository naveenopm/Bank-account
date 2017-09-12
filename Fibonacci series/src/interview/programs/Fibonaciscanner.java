package interview.programs;
import java.util.Scanner;

public class Fibonaciscanner {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,k;
		System.out.println(+i+ " "+j);
		sc = new Scanner(System.in);
		System.out.println("enter the value of count");
		int count=sc.nextInt();
		for(int c=1;c<count-2;c++) {
			k=i+j;
			System.out.println(" "+k);
			i=j;
			j=k;
		}

	}

}
