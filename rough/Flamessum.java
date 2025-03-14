package rough;
import java.util.Scanner;
public class Flamessum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String a= in.nextLine(); 
		System.out.print("Enter second name: ");
		String b= in.nextLine();
		 int c=0,m=(a.length()-c)+(b.length()-c),l=6,p=0;
	    for(int i=0;i<a.length();i++){
	    	 if(b.indexOf(a.charAt(i))!=-1){
	    		 c++;
	    	 }
         }
	    System.out.println(m);
    String[] d = {"FRIENDS", "LOVE", "AFFECTION", "MARRAGE", "ENEMY", "SISTER"};
      while (l > 1) {
       p = (p + m - 1) % l;
       for (int i = p; i < l - 1; i++) {
           d[i] = d[i + 1];  
       }
       d[l - 1] = "0"; 
       p=(p==l)?0:p;
       l--;
     }
     System.out.println("The relationship between "+a+" and "+b+" will end in "+ d[0]);
   }
}

