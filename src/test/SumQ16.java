package test;

import java.util.Scanner;

public class SumQ16 {

	public static void main(String[] args) {
		SumQ16 s1=new SumQ16();
		s1.abi();
	}

	
	public void abi() {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int result=0;
	
		int a[]=new int [n];
		for (int i=0; i<a.length ; i++) {
			a[i] = s.nextInt();
			
		}
		
		for (int i=0; i<a.length ; i++)
		{
			result=result+a[i];
		}
		
		//System.out.print(result);
		if(result%2==0) {
			System.out.print("even");
		}
		
		
	
		}}
