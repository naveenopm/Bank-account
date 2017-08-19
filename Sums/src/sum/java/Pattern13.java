package sum.java;

public class Pattern13 {

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
         int d=0;
         while(d<4)
         {
        	 int v=0;
        	 while(v<d)
        	 {
        		 System.out.print(" ");
        		 v++;
        	 }
        	 int g=1;
        	 while(g<4-d)
        	 {
        		
        		 System.out.print("*");
        		 System.out.print(" ");
        		 g++;
        	 }
        	 d++;
        	 System.out.println();
         }

		}

	}
