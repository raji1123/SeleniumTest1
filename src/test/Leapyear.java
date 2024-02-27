package test;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Leapyear s1 = new Leapyear();
		s1.abi();
	}

	public void abi() {
		Scanner s = new Scanner(System.in);

		int y = s.nextInt();
		if (y % 100 == 0) {

			if (y % 400 == 0) {
				System.out.print("leap year");

			} else {
				System.out.print("Not a leap year");
			}
		}
		else if (y % 4 == 0) {
			System.out.print("leap year");
		}
		else
			System.out.print("Not a leap year");
	}
}