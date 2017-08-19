package sum.java;

public class Pattern12 {

	public static void main(String[] args) {
		 int r=1;
	     while(r<4)
	     {
	    	 int c=1;
	    	 while(c<r)
	    	 {
	    		 c++;
	    		 System.out.print(" ");
	    	 }
	    	 int b=0;
	         while(b<4-r)
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
