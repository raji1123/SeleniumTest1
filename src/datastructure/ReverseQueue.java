package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {

	 public static void reverse(Queue<Integer>q){
	        
	        Stack<Integer> st=new Stack<>();
	        
	        
	        
	        while(!q.isEmpty()){
	            
	           st.push(q.poll()) ;
	            
	            
	        }
	        
	        while(!st.isEmpty()){
	            
	            
	            q.add(st.pop());
	        }
	        
	        
	        
	        
	        
	        
	        
	    }
	    
	    public static void main(String[] args) {
	       
	        
	     Scanner sc=new Scanner(System.in);
	     
	     int n=sc.nextInt();
			
			Queue<Integer> q=new LinkedList<>();
			
			
			for(int i=0;i<n;i++){
			    
			    
			    q.add(sc.nextInt());
			    
			}
			
			reverse(q);
			
			int size=q.size();
			
			
			while(!q.isEmpty()){
			    
			    System.out.print(q.poll());
			    
			    if(q.size()!=0){
			        
			        System.out.print(" ");
			    }
			    
			    
			}
			
			
			
			
			
			    
			}
			

}
