package softsouve;
import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = s.nextInt();
        int[][] d = new int[a][a];
        int c1 = 2; 
        for (int j = 0; j < a; j++) {
            for (int k = 0; k < a; k++) {
                while (!isPrime(c1)) { 
                    c1++;
                }
                d[j][k] = c1++;
            }
        }
        int top = 0, bottom = a - 1, left = 0, right = a - 1;
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
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
