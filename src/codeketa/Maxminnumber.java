package codeketa;

import java.util.HashMap;
import java.util.Scanner;

public class Maxminnumber {

	public void m1(){
	    Scanner s=new Scanner (System.in);
			
			System.out.println("enter the number");
			int n=s.nextInt();
			int a[]=new int[n];
			for(int i=0;i<a.length;i++) {
				
				a[i]=s.nextInt();
			
				
			}
	
			String a1;
			
			
			HashMap<Character,Integer> mp=new HashMap<>();
			mp.re
			
			int max=a[0];
			int min=a[0];
                for(int i=0;i<a.length;i++) 
                {
				
                System.out.print("normal arary is" +" "+a[i]);
                
			     }
                System.out.println();
                for(int i=1;i<a.length;i++) {
                	
                	if(a[i]>max) {
                		max=a[i];
                	}
                	else 
                	{
                		min=a[i];
                	}
                	
                }
                
                System.out.println("maxmium number is"+max);
                System.out.println("maxmium number is"+min);
                
		}
	
		
		
		
		
		
		
		public static void main(String[] args) {
			
			Maxminnumber obj= new Maxminnumber ();
			obj.m1();

		}

	}

