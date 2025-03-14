package rough;

import java.util.Scanner;

public class Zoho01 {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("xaxa: ");
    	String a=s.nextLine();//1.1.1.1
    	String[] b=a.split("\\=");//{addresss,"1.1.1.1"}
    	String c=b[1];//"1.1.1.1"
    	String[] d=c.split("\\.");//{"1,1,1,1"}
    	 for(int i=0;i<d.length-1;i++){
    		 System.out.print(d[i]+"[.]");
    	 }
		 System.out.print(d[3]);

    }
}