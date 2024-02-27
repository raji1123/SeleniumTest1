package patternpractice;

import java.util.Scanner;

public class LCM {

	 public static int findLCM(int[] arr) {
	        if (arr.length == 0) {
	            return 0; // Return 0 for an empty array or handle it based on your use case
	        }

	        int lcm = arr[0]; // Initialize lcm with the first number

	        for (int i = 1; i < arr.length; i++) {
	            lcm = calculateLCM(lcm, arr[i]); // Calculate LCM between current lcm and next number
	        }

	        return lcm;
	    }

	    public static int calculateLCM(int a, int b) {
	        int r = Math.max(a, b);
	        while (true) {
	            if (r % a == 0 && r % b == 0) {
	                break;
	            }
	            r++;
	        }
	        return r;
	    }
	
	
	
	
	
	
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt(); // Size of the array

        int[] numbers = new int[n]; // Initialize array

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt(); // Input array elements
        }

        int lcm = findLCM(numbers);
        System.out.println("LCM: " + lcm);


	}

}
