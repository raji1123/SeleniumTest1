package arrayQues;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

	
	
	public static boolean Isvalid(String s) {
		
		
		Stack<Character> st=new Stack<>();
		
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			
			if(ch=='('||ch=='{'||ch=='[') 
			{
				
				st.push(ch);
			}
			
			else if(st.isEmpty()) {
				return false;
			}
			
			
			else if(ch==')'&&st.peek()=='(') {
				
				st.pop();
			}
			
	        else if(ch=='}'&&st.peek()=='{') {
				
				st.pop();
			}
			
	       else if(ch==']'&&st.peek()=='[') {
	 	      st.pop();
	       }
			
	         else 
	    	   
			return false;
			
		}
		
		
		if(st.isEmpty()) 
			
			return true;
			
		
		else
		
			return false;
		

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		System.out.println("enter the expression");
		String s =sc.nextLine();
		
		if (Isvalid(s)) 
			System.out.println("Yes");
			
		
		
		else 
			System.out.println("No");
			
		
	}

}
