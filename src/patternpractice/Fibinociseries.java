package patternpractice;

import java.util.Scanner;

public class Fibinociseries {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the range of numbers");
		 int n=s.nextInt();
		 ;
		 System.out.println("enter the first term");
		 int n1=s.nextInt();
		 
		 System.out.println("enter the second term");
		 int n2=s.nextInt();
		 int n3 = 0;
		 {
		 System.out.print(n1+" "+n2); 
		 for(int i=2;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			 System.out.print(" "+n3+" ");
		 }
		// System.out.println(" "+nextterm+" ");
	}

}}

