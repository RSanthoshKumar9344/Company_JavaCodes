package softsouve;
import java.util.Scanner;
public class softsouveXyz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.next();
        int n = s.length();
        String l = "";
        for (int i = 1; i < n; i++) {  
            for (int j = 0; j <= n - i; j++) {  
                String s1 = s.substring(j, j + i);
                for (int k = j + 1; k <= n - i; k++) {  
                    if (s.startsWith(s1, k)) l = s1;  
                }}}
        System.out.println(l);
    }
}
