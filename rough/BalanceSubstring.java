package rough;

import java.util.Scanner;

public class BalanceSubstring {
	 public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("Enter: ");
	    	String a=s.nextLine();//RLRRLLRLRL
	    	int c=0;
	    	for(int i=0;i<a.length()-2;i++){
	    		String b=a.substring(i,i+3);
	    		if(b.equals("RLR")){
	    			c++;
	    		}
	    	}
	    	System.out.println(c);
}
}
