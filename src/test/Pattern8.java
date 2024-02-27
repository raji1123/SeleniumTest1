package test;
import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
	   int n=6;
	   int p=1;
	 //  p=1;
	for(int i=1;i<=n;i++) {
		
		for(int k=1;k<=n-i+1;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(p); //
		}
	 
	   for(int j=1;j<i;j++) {
			System.out.print(p); 
		}
		System.out.println(); 	
		
	  p+=2;
	}
	//System.out.println(); 
	
	}}