package test;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("enter the row number");

	   int n=s.nextInt();
	   if(n<=100) {
	   for(int i=1; i<=n;i++){
		   
	   for(int k=1;k<i;k++) 
	   {
	
		   System.out.print(" ");
		   
	  }
	
			for(int j=1;j<=n-i+1;j++) {
				System.out.print( j);
			}
			System.out.println("");
		}
	  
	}
	   if(n<0)
	   {
		   System.out.println("error");
	   }
}}
