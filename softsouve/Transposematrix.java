package softsouve;
import java.util.Scanner;
public class Transposematrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size: ");
        int a = s.nextInt();
        int[][] r = new int[a][a];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                r[i][j] = s.nextInt();
            }}
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++)
                System.out.print(r[j][i] + " ");
            System.out.println();
        }
    }
}
