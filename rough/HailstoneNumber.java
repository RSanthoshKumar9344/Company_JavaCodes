package rough;
import java.util.Scanner;
public class HailstoneNumber {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter: ");
	    	int s=sc.nextInt();
	    	while(s!=1){
	    		if(s%2==0){
	    			s=s/2;
	    			System.out.print(s+",");
	    		}
	    		else{
	    			s=s*3+1;
	    			System.out.print(s+",");
	    		}
	    	}
	 }
}
