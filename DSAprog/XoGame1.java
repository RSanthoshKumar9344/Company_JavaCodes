package DSAprog;
import java.util.Scanner;
public class XoGame1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       char[][] a={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
       char b = 'X'; 
       boolean d= false;
       while(!d){
    	   System.out.println("-------------");

       for (int i = 0; i < 3; i++) {
           System.out.print("| ");
          for (int j = 0; j < 3; j++) {
           System.out.print(a[i][j] + " | ");
           }
           System.out.println();
           System.out.println("-------------");
       }
       System.out.println("Enter row and col:turn of "+b);
       int row = scanner.nextInt() ;  
       int col = scanner.nextInt() ;  
       if (row < 0 || row > 2 || col < 0 || col > 2 || a[row][col] != ' ') {
            System.out.println("Invalid move. Try again.");
            continue;
       }
       a[row][col] = b;
       for (int i = 0; i < 3; i++) {
          if ((a[i][0] == b && a[i][1] == b && a[i][2] == b) || 
              (a[0][i] == b && a[1][i] == b && a[2][i] == b)) {
                d = true;
                break;
         }
       }
       if ((a[0][0] == b && a[1][1] == b && a[2][2] == b) ||
            (a[0][2] == b && a[1][1] == b && a[2][0] == b)) {
            d = true;
       }
          boolean e=true;
       for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
           if (a[i][j] == ' ') {
               e = false;  
           }
        }
       }
        if (d) {
            System.out.println("Player " + b + " wins!");
        } else if (e) {
        	d=true;
            System.out.println("It's a draw!");
        } else {
            b = (b == 'X') ? 'O' : 'X';
        }
     }
  }
}

 
	
	
	

