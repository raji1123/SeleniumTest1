package test;
import java.util.Scanner;

import patternpractice.Function;


public class Demo {

	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	
	
	
	public static void main(String[] args) {
		//Function s=new Function();
	//	s.add(0, 0);
		//s.div();
		//s.multiply();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		
		int a[] = new int[n];

		for (int i=0; i<a.length ; i++) {
			a[i] = scan.nextInt();
			
		}
		
		System.out.print(n + " ");
		System.out.println(k);
		
		
		for (int i=0; i<=a.length-1 ; i++)
		{
			System.out.print(a[i]);
			if(i<=a.length-1) {
				System.out.print(" ");
			}
			
		}
	}
	//oops
	
	//acess the obj
	
	//polymorphism - react differently
	//1.run time-method over riding
	//2.compile time-method over loading 
	
	//3.abstraction-method signature
	//4.inheritance-derive the method/variables from one class to another class
	//interface
	//encapsulation -getter and setter -
	
	
	//inheritance-parent and child 
	//single and multiple inheritance
	
	
	
	
	
	
	
	//Given a number m and k separated by a space print the numbers between m and k


	
	
	
	
	


}
/*Write a code to get the input in the given format and print the output in the given format.

Input Description:
First-line indicates two integers which are the size of array and 'K' value. Second-line indicates an integer contains elements of an array.

Output Description:
Print the taken input in the same format.

Sample Input :
5 3
1 2 3 4 5
Sample Output :
5 3
1 2 3 4 5*/