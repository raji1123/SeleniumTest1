package test;

import java.util.Scanner;

public class ZenQ19 {

	

	public static void main(String[] args) {
		ZenQ19 s1 = new ZenQ19 ();
		s1.abi();
		
	}

	public void abi() {
		Scanner s = new Scanner(System.in);

		String y = s.nextLine();
	
		int length=y.length();
		int m = 0,count = 1;
		for(int i=1;i<length;i++) {
			m=m+y.charAt(i);
			
			count++;
			
		}
		System.out.print(count);
	}

}
