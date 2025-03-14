package Collection;
    import java.util.LinkedList;
	import java.util.Queue;

	public class QueueExample {
	    public static void main(String[] args) {
	        // Creating a Queue using LinkedList
	        Queue<String> queue = new LinkedList<>();

	        // Enqueue (Adding elements)
	        queue.add("Apple");
	        queue.add("Banana");
	        queue.add("Cherry");

	        // Printing Queue
	        System.out.println("Queue: " + queue);

	        // Peek (View front element)
	        System.out.println("Front Element: " + queue.peek());

	        // Dequeue (Removing elements)
	        System.out.println("Removed: " + queue.poll());
	        System.out.println("Updated Queue: " + queue);
	    }
	}


