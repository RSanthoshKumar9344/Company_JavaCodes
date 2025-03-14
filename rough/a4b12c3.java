package rough;

public class a4b12c3 {
    public static void main(String[] args) {
        String input = "a4b12c3";
        StringBuilder result = new StringBuilder(); // To store the final expanded string
        int i = 0;

        while (i < input.length()) {
            char currentChar = input.charAt(i); // Get the character
            i++;
            StringBuilder number = new StringBuilder();

            // Extract the number part (handles multi-digit numbers)
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                number.append(input.charAt(i));
                i++;
            }

            // Convert the number part to an integer
            int count = Integer.parseInt(number.toString());

            // Append the character `count` times to the result
            for (int j = 0; j < count; j++) {
                result.append(currentChar);
            }
        }

        // Print the final expanded result
        System.out.println(result.toString());
    }
}
