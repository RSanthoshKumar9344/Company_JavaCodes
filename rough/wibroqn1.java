package rough;

import java.util.Scanner;

public class wibroqn1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter :");
		int s1=0;
		for(int i=0;i<4;i++){
			int a=s.nextInt();
			if(a<0){
				s1+=a;
			}
		}
		//s1=Math.abs(s1);(ans+  remove commend line)
		System.out.println(s1);
		
	}

}
