		package codeketa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reversestring {

	
	public void m1(){
		   Scanner s=new Scanner (System.in);
		  String name=s.nextLine();
		
		int length=name.length();
		   String rev="" ;
		   for(int i=length-1;i>=0;i--) {
			  
			  rev= rev+name.charAt(i);
			   
		   }
		   System.out.println(rev);
		   
		   
		   Scanner s1=new Scanner(System.in);
		   String name1=s1.nextLine();
		   
		   
		   int lengt=name1.length();
		   
		   
		   String re="";
		   
		   for(int i=lengt-1;i>=0;i--) {
			   
			   re=re+name.charAt(i);
		   }
		   
		   
	}
	
	
		
			
			public static void main(String[] args) {
				Reversestring r=new Reversestring();
				/*
				 * String str="weloce to java";
				 * 
				 * String[] words=str.split("\\s");
                    String revstring="";
				 * 
				 * for(String s:words) 
				 * 
				 * { 
				 * String reversewrd="";
				 * 
				 * for(int i=s.length()-1;i>=0;i--) {
				 * 
				 * 
				 * reversewrd=reversewrd+s.charAt(i);
				 * 
				 * } 
				 * revstring=revstring+reversewrd+" ";
				 * 
				 * 
				 * 
				 * } System.out.println(revstring);
				 */
				
				
				/*
				 * int num=12344444;
				 * 
				 * int rev=0; 
				 * while(num!=0) {
				 * 
				 * 
				 * rev=rev*10+num%10; 
				 * num=num/10; } 
				 * System.out.println(rev);
				 * 
				 * 
				 * Map<Character,Integer> mp=new HashMap<Character,Integer>();
				 * 
				 * String s="java";
				 * 
				 * char[]a=s.toCharArray();
				 * 
				 * for(char obj:a) {
				 * 
				 * 
				 * if(mp.containsKey(obj)) {
				 * 
				 * mp.put(obj, mp.get(obj)+1); }
				 * 
				 * else { mp.put(obj, 1);
				 * 
				 * }
				 * 
				 * 
				 * }
				 * 
				 * System.out.println(s +" "+mp);
				 * 
				 */
			
			String s1="name is tje";
			
			String []sp=s1.split(" ");
			
			for(String a2:sp) {
				
				
				
			}
			/*
			 * char[]a1=s1.toCharArray(); for(int i=a1.length-1;i>=0;i--) {
			 * 
			 * System.out.print(a1[i]); }
			 */
			
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
		
			int count=0;
			if(num>1) 
			{
				
				for(int i=1;i<=num;i++) {
					
					if(num%i==0) {
						count++;
					}
				}
				
				
				if(count==2) {
					
					System.out.println("prime number");
				}
				
				else {
					
					System.out.println("Not a prime number");
				}
			}
				
	}
			
			

	
}
	
	
	
	
	
	
	