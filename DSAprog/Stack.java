 package DSAprog;
import java.util.*;
class Stack{
	public static void main(String []argh){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input=sc.next();//{,(,(,(
			char[] v=input.toCharArray();
             int a=0;//'{'
             int b=0;//'['
             int c=0;//'('
             for(int i=0;i<input.length();i++){
            	 if(v[i]=='{'){
            		 a++;
            	 }
            	 else if(v[i]=='['){
            		 b++;
            	 }
            	 else if(v[i]=='('){
            		 c++;
            	 }
            	 
             }
             int a1=0;//'}'
             int b1=0;//']'
             int c1=0;//')'
             for(int i=0;i<input.length();i++){
            	 if(v[i]=='}'){
            		 a1++;
            	 }
            	 else if(v[i]==']'){
            		 b1++;
            	 }
            	 else if(v[i]==')'){
            		 c1++;
            	 }
            	 
             }
             if(a==a1&&b==b1&&c==c1){
            	 System.out.println("true");
             }
             else{
            	 System.out.println("false");
             }

             } 
        }
		
	}




