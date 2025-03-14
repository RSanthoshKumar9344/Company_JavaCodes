package softsouve;
public class Prog4 {
     static int j;
     static void methodA(int i){
       boolean b;
     do{
       b=i<10 | methodB(4); 
	   b=i<10 || methodB(8); 
	 }while (!b);
	 }
     static boolean methodB(int i){
      j += i;
     return true;
     } 
     public static void main(String[] args){ 
    	 methodA(0);
		 System.out.println("j = " + j);

	}
}//Ans:B.j=4
