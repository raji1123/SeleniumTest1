package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseTheArralist {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Integer> arrayList = new ArrayList<>();

	        System.out.println("Enter the elements of the ArrayList (enter a non-integer value to finish):");
	        while (scanner.hasNextInt()) {
	            int num = scanner.nextInt();
	            arrayList.add(num);
	        }

	        System.out.println("Original ArrayList: " + arrayList);

	        int left = 0;
	        int right = arrayList.size() - 1;

	        while (left < right) {
	            int temp = arrayList.get(left);
	            arrayList.set(left, arrayList.get(right));
	            arrayList.set(right, temp);
	            left++;
	            right--;
	        }

	        System.out.println("Reversed ArrayList: " + arrayList);
	    }
	}


