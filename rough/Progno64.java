package rough;

import java.util.Scanner;

public class Progno64 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:"); 

		int n=sc.nextInt();
		
		int m=1,l=1,sum=0;
		for(int i=1;i<=n;i++)
		{
		    for(int k=i;k<n;k++)
		    {
		        System.out.print("   ");
		    }
		    for(int j=1;j<=m;j++)
		    {
		        if(i==j&&i>1)
		        {
		            for(int s=(l-(i-1));s<=(l+(i-2));s++)
		            {
		                sum=sum+s;
		            }
		            sum=sum*3;
		            System.out.print(sum+" ");
		        }
		        else{
		        System.out.print(l+" ");
		        l++;
		        }
		        
		    }
		    System.out.println();
		    m=m+2;
		    sum=0;
		}
		
	}
}





