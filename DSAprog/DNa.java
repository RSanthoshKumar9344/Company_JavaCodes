package DSAprog;
import java.util.*;
public class DNa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of genes: ");
		int n = in.nextInt();
		in.nextLine();

		if (n <= 0) {
			System.out.println("Number of genes must be positive.");
			return;
		}

		String[] genes = new String[n];
		System.out.print("Enter the genes separated by space: ");
		genes = in.nextLine().split(" ");

		if (genes.length != n) {
			System.out.println("Invalid input: Number of genes entered does not match expected count.");
			return;
		}

		int[] health = new int[n];
		System.out.print("Enter the health values separated by space: ");
		String[] input = in.nextLine().split(" ");
		if (input.length != n) {
			System.out.println("Invalid input: Number of health values does not match expected count.");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			health[i] = Integer.parseInt(input[i]);
		}

		System.out.print("Enter the number of strands: ");
		int n_s = in.nextInt();
		in.nextLine();

		if (n_s <= 0) {
			System.out.println("Number of strands must be positive.");
			return;
		}

		String[] strands = new String[n_s];
		int[][] range = new int[n_s][2];

		for (int i = 0; i < n_s; i++) {
			System.out.printf("Enter first index, last index, and strand %d: ", i + 1);
			String[] inputStrand = in.nextLine().split(" ");

			if (inputStrand.length != 3) {
				System.out.println("Invalid input: Please enter first index, last index, and strand.");
				return;
			}
			
			try {
				range[i][0] = Integer.parseInt(inputStrand[0]);
				range[i][1] = Integer.parseInt(inputStrand[1]);
				strands[i] = inputStrand[2];
			} catch (NumberFormatException e) {
				System.out.println("Invalid input: Indices must be integers.");
				return;
			}
		}

		int minHealth = Integer.MAX_VALUE;
		int maxHealth = Integer.MIN_VALUE;

		for (int i = 0; i < n_s; i++) {
			int first = range[i][0];
			int last = range[i][1];
			int totalHealth = calculateTotalHealth(genes, health, first, last, strands[i]);
			minHealth = Math.min(minHealth, totalHealth);
			maxHealth = Math.max(maxHealth, totalHealth);
		}

		System.out.printf("Minimum health: %d, Maximum health: %d%n", minHealth, maxHealth);
		in.close();
	}

	public static int calculateTotalHealth(String[] genes, int[] health, int first, int last, String strand) {
		int totalHealth = 0;
		for (int i = first; i <= last; i++) {
			int geneCount = countOccurrences(genes[i], strand);
			totalHealth += geneCount * health[i];
		}
		return totalHealth;
	}

	public static int countOccurrences(String gene, String strand) {
		int index = 0;
		int count = 0;
		while ((index = strand.indexOf(gene, index)) != -1) {
			count++;
			index++;
		}
		return count;
	}
}