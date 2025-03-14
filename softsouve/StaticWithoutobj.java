package softsouve;

	class Calculator {
	    static int add(int a, int b) {
	        return a + b;
	    }
	}

	public class StaticWithoutobj {
	    public static void main(String[] args) {
	        int sum = Calculator.add(5, 10); // No object needed
	        System.out.println("Sum: " + sum);
	    }
	}


