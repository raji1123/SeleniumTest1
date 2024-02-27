package test;

import java.util.Scanner;

public class ZQ7 {

	public static void main(String[] args) {
		ZQ7 s1=new ZQ7();
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
		
		System.out.print(result);
		
		
	
		}}