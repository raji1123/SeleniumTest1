package codeketa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurance {
	 static StringBuilder duplicates(String s){
	        
	        HashMap<Character,Integer>mp=new HashMap<>();
	        StringBuilder sb=new StringBuilder();
	        char [] ch=s.toCharArray();
	        for(char c:ch){
	            
	            mp.put(c,mp.getOrDefault(c,0)+1);
	            
	        }
	        for (int i = s.length() - 1; i >= 0; i--) {
	            if (mp.get(s.charAt(i)) == 1) {
	                sb.insert(0, s.charAt(i));
	            }
	        }

	        return sb;
	        
	        
	        
	        
	    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 Scanner obj = new Scanner(System.in);
	        String s = obj.nextLine();
	        
	             StringBuilder result= duplicates(s);
	        
	        System.out.println(result);
	        
	}

}
