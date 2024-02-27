	package codeketa;

import java.util.Scanner;

public class Acsendinganddescendingorder {
 
	
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter the expression");
		 int n=sc.nextInt();
		
		 int a[]= new int [n];
		 
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt()
			 ;
		 }
		
		int k;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {//4>3
				if(a[i]<a[j]) {
					k=a[i];
					a[i]=a[j];
					a[j]=k;
					
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		 }
		
		 }
		
	}


