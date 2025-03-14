package softsouve;
import java.util.Scanner;
class FibonicPrime {
	    public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a number: ");
	       int a1=sc.nextInt();//2
	       System.out.println("Enter a number: ");
	       int b1=sc.nextInt();//50
	       System.out.println("Enter a number: ");
	       int c1=sc.nextInt();//100 
		   int b=1,s=0;//23
	       for(int a=0;a<b1;){
	    	   int c=a+b;
	    	   a=b;
	    	   b=c;
	    	   //0 1 1 2 3 5 8 13 21 34 => prime 2 3 5 13 
	    	 if(Prime(a)){
	    		 s=s+a;
	    	 }
	     } 
	       System.out.println(s);
	     String o=s>c1?"yes":"no"; //codition?true:false
	     System.out.println(o);
	}
	  public static boolean Prime(int t) {
	  if (t < 2)
	  	return false;
	    for (int i = 2; i <= Math.sqrt(t); i++) {
	      if (t % i == 0) 
	      return false;
	    }
	  return true;
	  }
	}
//input:2 90 100
//output:yes
//2, 3, 5, 8, 13, 21, 34, 55, 89
//2 3 5 13 89
//112

		//input:2 50 100
		//output:no
		//2, 3, 5, 8, 13, 21, 34
		//2 3 5 13 
		//23

	
	
	
	
	
	