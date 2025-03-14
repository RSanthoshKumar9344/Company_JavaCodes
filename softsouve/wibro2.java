package softsouve;

import java.util.Arrays;

public class wibro2 {
	public static void main(String[] args) {
		int[] a={1,4,7,3,8};//1,3,5,7,8
		Arrays.sort(a);
		int b=a[a.length-1]+a[0];
		int c=b/2;//4
		System.out.println(c);
		int d=a.length/2;//2
		if(a.length%2!=0){
			d++;
		}
		else{
			d=d;
		}
		System.out.println(d);
		if(c<a[d-1]){
			System.out.println("big");
			
		}
		else if(c>a[d-1]){
			System.out.println("small");
			
		}
		else{
			System.out.println("eq");
		}
	}

}
