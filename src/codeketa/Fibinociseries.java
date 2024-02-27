package codeketa;

import java.util.Scanner;

public class Fibinociseries {

	
		public void m1(){
		   Scanner s=new Scanner (System.in);
		   int n=s.nextInt();
				int num1=s.nextInt();// 1 2 3 5 7 9 11
			     int num2=s.nextInt();
			
			     
			     int num3=0;
			int[] a=new int[n];
			System.out.print(num1+" "+num2+" ");
				
				for(int i=0;i<a.length;i++) {
			
					
				num3=num1+num2;
				
				
				System.out.print(num3);
				
				num1=num2;
				num2=num3;
				
				if(i!=a.length-1) {
					
					System.out.print(" ");
				}
				}
				
				}
				
			
			
			
			
			
			
			
			
			public static void main(String[] args) {
				
				Fibinociseries  obj=new Fibinociseries();
			obj.m1();
	}

}
