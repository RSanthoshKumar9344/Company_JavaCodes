package rough;

public class HelloSum {
	public static void main(String[]args){
   char[] a={'H','E','L','L','O'};
   for(int i=0;i<5;i++){
	   for(int j=0;j<5;j++){
		   if(i==j&&i<5){
			   System.out.print(a[i]);
		   }
		   else if(i+j==4&&i<5){
			   System.out.print(a[i]);

		   }
	   else{
			   System.out.print(" ");
		   }
		   
	   }
	   System.out.println();

   }

}
}
