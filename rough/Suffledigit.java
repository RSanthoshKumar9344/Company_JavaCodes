package rough;
import java.util.*;
public class Suffledigit {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
       Random r = new Random();
        Collections.shuffle(numbers, r);
        System.out.println("Shuffled numbers: " + numbers);
    }
}
