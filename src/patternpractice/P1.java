package patternpractice;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/*
	 * for (i = 1; i <= n; i++) { for (int k = 1; k <= n-i; k++) {
	 * System.out.print(" "); } for (j = 1; j <= n; j++) { System.out.print("*");
	 * 
	 * } System.out.println(); }
	 */
	/*
	 * int p;
	 * 
	 * 
	 * for (i = 1; i <=n; i++) { p=1;
	 * 
	 * for ( j = 1; j <=n-i+1; j++)
	 * 
	 * { System.out.print(p); p+=2; } System.out.println(); }
	 */
	// char p=5;
	// char p=65;
	/*
	 * int n=6; int i,j; for (i = 1; i <=n; i++) { char p=65;
	 * 
	 * 
	 * for (int k = 1; k <i; k++) { System.out.print(" "); } for ( j = 1; j <=n-i+1;
	 * j++)
	 * 
	 * { System.out.print(p); p+=1;
	 * 
	 * } System.out.println();
	 */

	// System.out.print("enter the number");

	// int n=s.nextInt();
	// int n=s.nextInt();
	int n=5;for(
	int i = 1;i<=n;i++)
	{

		for (int j = 1; j <= n; j++) {
			if (i == 1 || i == n || j == 1 || j == n)

				System.out.print("*");
		}

		{
			System.out.print(" ");
		}
		System.out.println();

	}

}}
