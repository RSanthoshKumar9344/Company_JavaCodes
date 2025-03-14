package rough;

public class fLAMES {
    public static void main(String[] args) {
        int m = 8; 
        char[] d = {'A', '0', '0', '0', '0', '0'};
        int length = d.length;
 int index = 0;  // Start from the first index
        
        // While loop to eliminate characters until only one remains
        while (length > 1) {
            // Find the index of the character to eliminate
            index = (index + m - 1) % length;

            // Shift the remaining characters to eliminate the character at index
            for (int i = index; i < length - 1; i++) {
                d[i] = d[i + 1];  // Move the next character to the current position
            }
            d[length - 1] = '\0'; // Nullify the last character

            // Decrease the length as one character is eliminated
            length--;

            // Reset index to 0 if it goes out of bounds
            if (index == length) {
                index = 0;
            }
        }

        // Output the last remaining character
        for (char c : d) {
            if (c != '\0') {
                System.out.println("The result is: " + c);
            }
        }
    }
}
