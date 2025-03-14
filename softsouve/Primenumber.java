package softsouve;

public class Primenumber {
    public static void main(String[] args) {
        for (int t = 2; t < 10; t++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(t); i++) {
                if (t % i == 0) { // If divisible, it's not prime
                    isPrime = false;
                    break; // Stop checking further
                }
            }

            // Print only if the number is prime
            if (isPrime) {
                System.out.println(t);
            }
        }
    }
}
