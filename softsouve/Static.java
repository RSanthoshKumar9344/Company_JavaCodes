package softsouve;

	class Bike {
	    static int wheels = 2; // Shared by all Bike objects

	    void display() {
	        System.out.println("All bikes have " + wheels + " wheels.");
	    }
	}

	public class Static {
	    public static void main(String[] args) {
	        Bike b1 = new Bike();
	        Bike b2 = new Bike();
	        b1.display();
	        b2.display();
	        
	        // Modifying static variable
	        Bike.wheels = 3;
	        b1.display();
	        b2.display();
	    }
	}



