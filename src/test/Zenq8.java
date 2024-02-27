package test;

import java.util.Scanner;

public class Zenq8 {

	public static void main(String[] args) {
		Zenq8 s1=new Zenq8();
		s1.abi();
	}

	
	public void abi() {
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int temp=n;
		
	while(n>0) 
	{
		
		
		
		if((temp%a==0)&&(temp%b==0)&&(temp%c==0)) 
			
		{
			
			System.out.println(" yes");
			break;
		}
		
		else {
			System.out.println(" No");
			break;
		}
		
		
	}
	
	
	
	
	 
		  
	 
		
	}}
		
