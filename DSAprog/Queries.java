package DSAprog;
import java.util.Scanner;
public class Queries {
	public static void main(String arg[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
         int[][] a={{1,56,67,89},{2,89,54,90},{3,78,91,83},{4,69,72,95}};
	     String  c=s.nextLine();//*
	     String d=s.nextLine();//A>70
	     char e=d.charAt(0);//A
	     char e1=d.charAt(1);//>
         int f=Integer.parseInt(d.substring(2,4));//70
	     for(int i=0;i<4;i++){
	     if(e=='A'){
	    		   if(a[i][1]<f&&e1=='>'){
                   }
	    		   else if(a[i][1]>f&&e1=='<'){
		    			 a[i][0]= a[i][1]=a[i][2]= a[i][3]=0;
		    		   }
	    		    } 
	    		 else if(e=='B'){
		    		   if(a[i][2]<f&&e1=='>'){
			    			 a[i][0]= a[i][1]=a[i][2]= a[i][3]=0;
			    		   }
		    		   else if(a[i][2]>f&&e1=='<'){
			    			 a[i][0]= a[i][1]=a[i][2]= a[i][3]=0;
			    		   }
			    		 }
	    		 else if(e=='C'){
		    		   if(a[i][3]<f&&e1=='>'){
			    			 a[i][0]= a[i][1]=a[i][2]= a[i][3]=0;
		    		   }
		    		   if(a[i][3]>f&&e1=='<'){
			    			 a[i][0]= a[i][1]=a[i][2]= a[i][3]=0;
			    		   }
		    		 }
	         }	 
	      for(int i=0;i<4;i++){
	    	 for(int j=0;j<4;j++){
	    		  if(c.equals("*")){
	    		     if(a[i][j]!=0&&j!=0){
	    			   System.out.print(a[i][j]+" ");
	    		     }
	    		   }
	    		 if(c.equals("A")){
	    		     if(a[i][j]!=0&&j==1){
	    			   System.out.print(a[i][j]+" ");
	    		     }
	    		   }
	    		 if(c.equals("B")){
	    		     if(a[i][j]!=0&&j==2){
	    			   System.out.print(a[i][j]+" ");
	    		     }
	    		   }
	    		 if(c.equals("C")){
	    		     if(a[i][j]!=0&&j==3){
	    			   System.out.print(a[i][j]+" ");
	    		     }
	    		   }
	    		 
	    		 }
	    	    System.out.println("");
	    	 }
	     }	
}

