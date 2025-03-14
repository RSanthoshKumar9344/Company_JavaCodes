package Collection;

import java.util.Iterator;
import java.util.Vector;
public class IterateVector {
	    public static void main(String[] args) {
	        Vector<Integer> numbers = new Vector<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);

	        // Using for-each loop
	        for (int num : numbers) {
	            System.out.println("Number: " + num);
	        }

	        // Using Iterator
	        Iterator<Integer> iterator = numbers.iterator();
	        while (iterator.hasNext()) {
	            System.out.println("Iterator Value: " + iterator.next());
	        }
	    }
	}



