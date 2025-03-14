//package rough;
//
//
//	class Data1{
//	    private String message;
//	    private boolean hasData = false;
//
//	    public synchronized void produce(String msg) {
//	        while (hasData) {  // If data is already present, wait
//	            try {
//	                wait();
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	        }
//	        message = msg;
//	        hasData = true;
//	        System.out.println("Produced: " + message);
//	        notify();  // Wake up the waiting thread
//	    }
//
//	    public synchronized String consume() {
//	        while (!hasData) {  // If no data, wait
//	            try {
//	                wait();
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	        }
//	        hasData = false;
//	        System.out.println("Consumed: " + message);
//	        notify();  // Notify producer that data has been consumed
//	        return message;
//	    }
//	}
//
//	class Producer extends Thread {
//	    private Data data;
//
//	    public Producer(Data data) {
//	        this.data = data;
//	    }
//
//	    public void run() {
//	        data.produce("Hello World!");
//	    }
//	}
//
//	class Consumer extends Thread {
//	    private Data data;
//
//	    public Consumer(Data data) {
//	        this.data = data;
//	    }
//
//	    public void run() {
//	        data.consume();
//	    }
//	}
//
//	public class Data {
//	    public static void main(String[] args) {
//	        Data data = new Data();
//	        Producer producer = new Producer(data);
//	        Consumer consumer = new Consumer(data);
//
//	        consumer.start();  // Start consumer first (it will wait)
//	        producer.start();  // Then start producer (it will produce data)
//	    }
//	}
//
//
