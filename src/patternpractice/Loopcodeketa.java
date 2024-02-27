package patternpractice;

import java.util.Scanner;

public class Loopcodeketa {//user input and ouput

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//System.out.print("print the 1st array line");
		int n = s.nextInt();
		int a[] = new int[n];
		//System.out.print("print the 2nd array line");
		int n1 = s.nextInt();
		int a1[] = new int[n1];
		

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();

		}
		
		
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = s.nextInt();

		}


	
		{
			for (int i = 0; i <= a.length - 1; i++) {
				System.out.print(a[i]);
				if (i != a.length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
				for ( int i = 0; i <= a1.length - 1; i++) {
					System.out.print(a1[i]);
					if (i != a1.length - 1) {
						System.out.print(" ");
					}
				
				
				
			}
		}

	}
}
