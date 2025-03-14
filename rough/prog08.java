package rough;
import java.util.Arrays;

public class prog08 {
    public static void main(String args[]){

	String a="anagramm";
	String b="marganaa";
	
		
		//if(a.length()==b.length()){
	       char e[]=a.toCharArray();//{a,n,a,g,r,a,m,m}
	       char f[]=b.toCharArray();//{m,a,r,g,a,n,a,a}
	       java.util.Arrays.sort(e);//{a,a,a,g,m,m,n}
	       java.util.Arrays.sort(f);//{a,a,a,a,g,m,n}
	       String str1=Arrays.toString(e);
	       String str2=Arrays.toString(f);
	       System.out.println(str1);
	       System.out.println(str2);


}
}
