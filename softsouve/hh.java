package softsouve;
import java.util.Scanner;
public class hh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int d = s.nextInt();
        System.out.print("Enter the divisor: ");
        int d1 = s.nextInt();
        System.out.println("\nOutput:");
        System.out.println(d1 + ")" + d);
        String n = Integer.toString(d);
        int temp = 0;
        for (int i = 0; i < n.length(); i++) {
            temp = temp * 10 + (n.charAt(i) - '0');
            if (temp < d1) {
                System.out.println("  **");
                continue;
            }
            int q = temp / d1;
            int r = temp % d1;
            System.out.println("  " + temp);
            System.out.println("  " + (q * d1));
            System.out.println("  **");
            temp = r;
        }
    }
}
