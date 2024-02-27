package test;
import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		
		
		        
		        
	        Scanner s=new Scanner(System.in);
	            	int n=s.nextInt();
			
		String s1="hh";
		
		s1.length();
		int 
			int a[]=new int [n];
			for (int i=0; i<a.length; i++) {
				a[i] = s.nextInt();
				
			}
		
		//int a[]= {10,20,40,30,50};
			int max=a[0];
			int min=a[0];
			
			
			for (int i=1; i<a.length ;i++)
			{
				if(a[i]>max){
				    
				   max=a[i]	;	
				   }
				
		
             }
			if(max>15) {
				System.out.println(max);
			}else
			{
				System.out.println(-1);
				
			}
	}}
