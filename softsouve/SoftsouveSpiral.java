package softsouve;
import java.util.Scanner;
public class SoftsouveSpiral {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter a num:");
    	int a=s.nextInt();//3
    	int[] a1=new int[a*a];//[0 0 0 0 0 0 0 0 0]
    	int c=0,c1=0;
    	for(int i=2;i<1000;i++){
    		boolean b=true;
    		if(c==a1.length){
				break;
			}
    		for(int j=2;j<=Math.sqrt(i);j++){
    			if(i%j==0){
    				b=false;
    				break;
    			}   		
    		}
    		if(b==true){
    			a1[c++]=i;
    		}
    	}
    	int[][] d=new int[a][a];
        	for(int j=0;j<a;j++){
            	for(int k=0;k<a;k++){
            		d[j][k]=a1[c1++];
            	}
        	}
        	int top = 0, bottom = a-1, left = 0, right = a-1;
              while (top <= bottom && left <= right) {
              for (int i = left; i <= right; i++) System.out.print(d[top][i] + " ");
              top++;
              for (int i = top; i <= bottom; i++) System.out.print(d[i][right] + " ");
              right--;
              if (top <= bottom) {
                  for (int i = right; i >= left; i--) System.out.print(d[bottom][i] + " ");
                  bottom--;
              }
              if (left <= right) {
                  for (int i = bottom; i >= top; i--) System.out.print(d[i][left] + " ");
                  left++;
              }
          }
    	}   	
}


