package test;

import java.util.Scanner;

public class ZenQ5 {

	public static void main(String[] args) {
		ZenQ5 s1=new ZenQ5();
		s1.abi();
	}

	
	public void abi() {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
	
		int a[]=new int [n];
		for (int i=0; i<a.length ; i++) {
			a[i] = s.nextInt();
			
		}
		
		for (int i=0; i<a.length ; i++) {
			if(a[i]%2==0) {
				System.out.print("even"+" ");
			}
			else {
				System.out.print("odd"+" ");
			}
		}
		
		
		
	
		}}



