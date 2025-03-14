//package rough;
//
//import java.awt.List;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//
//	class Person {
//	    String name;
//	    int age;
//
//	    Person(String name, int age) {
//	        this.name = name;
//	        this.age = age;
//	    }
//
//	    @Override
//	    public String toString() {
//	        return name + ": " + age;
//	    }
//	}
//
//	class AgeComparator implements Comparator<Person> {
//	    @Override
//	    public int compare(Person p1, Person p2) {
//	        return Integer.compare(p1.age, p2.age); // Sort by age in ascending order
//	    }
//	}
//
//	public class Comparator1 {
//	    public static void main(String[] args) {
//	      //  List<Person> people = new ArrayList<>();
//	        people.add(new Person("Alice", 30));
//	        people.add(new Person("Bob", 25));
//	        people.add(new Person("Charlie", 35));
//
//	        // Sort using the custom comparator
//	        Collections.sort(people, new AgeComparator());
//
//	        System.out.println(people);  // Output: [Bob: 25, Alice: 30, Charlie: 35]
//	    }
//	}
//
//
