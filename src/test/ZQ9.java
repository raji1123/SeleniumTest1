package test;

import java.util.Scanner;

public class ZQ9 {

	public static void main(String[] args) {
		ZQ9 s1=new ZQ9();
		s1.abi();
	}

	
	public void abi() {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
	
	
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=s.nextInt();
		}
		
		
		int max=a[0];
		
		int min=a[0];
		
		
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
                   if(a[i]<min) {
				
				min=a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	
	}}