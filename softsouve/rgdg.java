package softsouve;
import java.util.Scanner;
public class rgdg{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
        int n = s.length();
        String l = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (s.indexOf(sub, i + 1) != -1 && sub.length() >= l.length()) {
                    l = sub;
                }
            }
        }
        System.out.println(l);
    }
}