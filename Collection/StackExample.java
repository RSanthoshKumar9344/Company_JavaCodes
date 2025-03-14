package Collection;

	import java.util.Stack;

	public class StackExample {
	    public static void main(String[] args) {
	        // Creating a Stack
	        Stack<String> stack = new Stack<>();

	        // Pushing elements onto the stack
	        stack.push("Apple");
	        stack.push("Banana");
	        stack.push("Cherry");

	        // Printing Stack
	        System.out.println("Stack: " + stack);

	        // Peeking the top element
	        System.out.println("Top Element: " + stack.peek());

	        // Popping elements from the stack
	        System.out.println("Popped: " + stack.push("as"));
	        System.out.println("Updated Stack: " + stack);
	    }
	}


