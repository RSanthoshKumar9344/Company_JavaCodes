package rough;

public class sdsfed {





    public static void main(String[] args) {
	      String a="HELLO";
		  char[] b=a.toCharArray();//{H,E,L,L,O}
		  
		  for (int i = 0; i < 9; i++) {
			  for (int j = 0; j < 9; j++) {
			     if (i == j && i <5) {
			    	 System.out.print("*" + " ");
			     }
			     else if (i>=j && i<5) {
			    	 System.out.print("*" + " ");
			     }
			     else if (i + j == 8 && i < 4) {
			    	 System.out.print("*" + " ");
			     } 
			     else if (i + j >= 8 && i < 5) {
			    	 System.out.print("*" + " ");
			     } 
			   
			     else if (i == j && i > 5) {
  		    	 System.out.print("*"+ " ");
     		     }
			     else if (i <= j && i > 4) {
	  		    	 System.out.print("*"+ " ");
	     		     }
			     else if (i + j == 8 && i >4) {
     		    	 System.out.print("*"+ " ");
		        } 
			     else if (i + j == 8 && i >4) {
     		    	 System.out.print("*"+ " ");
		        }
			     else if (i + j <= 8 && i >4) {
     		    	 System.out.print("*"+ " ");
		        }
			     else {
			         System.out.print("  ");
			     }
			  }
	        System.out.println();
			}
      }
}





