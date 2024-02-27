package test;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		Reversestring s=new Reversestring();
		s.abi();
		
	}

	public void abi() {
		Scanner s = new Scanner(System.in);

		String name = s.nextLine();
	
		int length=name.length();
		
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.print(rev);
	}

}