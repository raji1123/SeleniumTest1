package patternpractice;

//import java.util.Scanner;

public class Acsendingorder {

	public static void main(String[] args) {

	//	Scanner s = new Scanner(System.in);

		// System.out.println("enter the list of arrays");
		int b[] =  {5, 2, 8, 7 };
		int k = 0;
		for (int i = 0; i < b.length; i++) {
			// b[i]=s.nextInt();
			System.out.print(b[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i] >b[j]) {
					k = b[i];
					b[i] = b[j];
					b[j] = k;
					// System.out.println(b[i]+" ");
				}
			}
		}
		System.out.println("sorted array ");

		for (int i = 0; i < b.length; i++) {

			System.out.print(b[i] + " ");
		}
	}

}
