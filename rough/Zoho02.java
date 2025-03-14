//Pattern
//
//1 
//2 6 
//3 7 10 
//4 8 11 13 
//5 9 12 14 15 
//


package rough;
public class Zoho02 {
    public static void main(String[] args) {
	     int s = 1; 
      for (int i = 1; i <= 5; i++) {
	     int t = s;
	    for (int j = 1; j <= i; j++) {
	       System.out.print(t + " ");
	       t = t + (5 - j); 
	    }
	    System.out.println(); 
	    s++; 
	  }
   }
}
 
