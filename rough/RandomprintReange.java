package rough;
import java.util.*;
public class RandomprintReange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter number of test cases: ");
        int a1 = s.nextInt();  
        for (int i = 0; i < a1; i++) {
            int a2 = s.nextInt(); 
            int a3 = s.nextInt();  
            int[] n = new int[a3 - a2 + 1];
            for (int j = a2; j < n.length; j++) {
                n[j] = a2 + j;
            }
            for (int j = 0; j < n.length; j++) {
                int randomIndex = r.nextInt(n.length);
                int temp = n[j];
                n[j] = n[randomIndex];
                n[randomIndex] = temp;
            }
            for (int num : n) {
                System.out.print(num + " ");
            }
            System.out.println();  
            }
    }
}
