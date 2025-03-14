package softsouve;

import java.util.Scanner;

public class wibro3 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter :");
		for(int i=0;i<2;i++){
			String a=s.nextLine();
			String[] b=a.split(" ");
			int c=b.length;
			System.out.println(c);
		}

}
}
