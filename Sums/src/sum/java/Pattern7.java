package sum.java;

public class Pattern7 {

	public static void main(String[] args) {
      int r=1;
      do {
    	  int c=0,d;
    	  while(c<5-r) {
    		  d=c+r;
    		  System.out.print(d);
    		  c++;
    	  }
    	  r++;
    	  System.out.println();
      }while(r<5);
	}
}