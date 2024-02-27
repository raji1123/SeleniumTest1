package patternpractice;

import java.util.Scanner;

//import java.util.Scanner;
public class GCD {
	

	
	static int Hcf(int a,int b) {


	
		
	while(a!=0&&b!=0) {
			
			if(a>b) {
				
				a=a%b;
			}else {
				b=b%a;
			}
		}
			if(a!=0) 
			{
				return a;	
			}
			
			
			else 
			{
				return b;		
				
			}
	
		
			
		}
		
	
     static int  GCDOGArray(int[]a) {
    	 
    	 int gcd=0;
    	 
    	 
    	 for(int i=0;i<a.length;i++) {
    		 
    		 
    		 gcd=Hcf(gcd,a[i]);
    		 
    	 }
    	 
    	 
		return gcd;
    	 
    	 
    	 
     }
	
	
	
	
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter your number of array:");
	 int n=sc.nextInt();
	 
	 
	 
		
		 int[] a=new int[n];
		  
		  
		  for(int i=0;i<a.length;i++) {
		 
		 a[i]=sc.nextInt(); }
		  
		  System.out.print(GCDOGArray(a)+ "\n");
	
	
	}

}
