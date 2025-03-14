package softsouve;
import java.util.Scanner;
public class dcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sentence (S):");
        String S = s.nextLine();
        System.out.println("Enter the substring to search for (W):");
        String W = s.next();
        String[] words = S.split(" ");
        System.out.println("Words containing '" + W + "':");
        for (String word : words) {
            if (word.contains(W)) {
                System.out.println(word);
            }
        }
    }
}
