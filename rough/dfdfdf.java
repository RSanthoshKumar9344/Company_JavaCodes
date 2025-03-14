package rough;

import java.util.Scanner;


public class dfdfdf {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int[] positiveArr = new int[n];
	        int positiveCount = 0;
	        for (int num : arr) {
	            if (num >= 0) {
	                positiveArr[positiveCount++] = num;
	            }
	        }
	        int midIndex = positiveCount / 2;
	        System.out.println(positiveArr[midIndex]);
	    }
	}



