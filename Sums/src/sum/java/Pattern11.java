package sum.java;

public class Pattern11 {

	public static void main(String[] args) {
		 int r=1;
	     while(r<4)
	     {
	    	 int c=0;
	    	 while(c<3-r)
	    	 {
	    		 c++;
	    		 System.out.print(" ");
	    	 }
	    	 int b=0;
	         while(b<r)
	         {
	        	 b++;
	        	 System.out.print('*');
	        	 System.out.print(" "); 
	        	 
	         }
	         r++;
	         System.out.println();
	     }

		}

	}
