package softsouve;
import java.util.Scanner;
public class s6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] p = {50, 40, 30, 20, 10};
        System.out.println("Enter the buy year (1-based index):");
        int buyYear = s.nextInt();
        System.out.println("Enter the sell year (1-based index):");
        int sellYear = s.nextInt();
        int b = p[buyYear - 1];
        int s1 = p[sellYear - 1];
        int l = b - s1;
        System.out.println(b + " - " + s1 + " = " + l);
    }
}

