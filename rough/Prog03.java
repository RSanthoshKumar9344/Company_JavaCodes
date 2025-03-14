package rough;

public class Prog03 {
	    public static void main(String[] args) {
	        printPattern("HELLO");
	    }

	    public static void printPattern(String word) {
	        for (char letter : word.toCharArray()) {
	            if (letter == 'H' || letter == 'E') {
	                for (int i = 0; i < 2; i++) {
	                    System.out.print(letter);
	                }
	            } else if (letter == 'L') {
	                for (int i = 0; i < 4; i++) {
	                    System.out.print(letter);
	                }
	            } else if (letter == 'O') {
	                System.out.print("00");
	            }
	        }
	        for (int i = word.length() - 2; i >= 0; i--) {
	            char letter = word.charAt(i);
	            if (letter == 'H' || letter == 'E') {
	                for (int j = 0; j < 2; j++) {
	                    System.out.println(letter);
	                }
	            } else if (letter == 'L') {
	                for (int j = 0; j < 4; j++) {
	                    System.out.println(letter);
	                }
	            }
	        }
	    }
	}


