import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paytabs {
	
	
	static boolean pattern(String s) {
		
		
		Pattern pa=Pattern.compile("[^a-zA-Z0-9\\s]");
		Matcher m=pa.matcher(s);
		return m.find();
		
		
	}
	
	public static void main(String[] args) {
		
		
		String s1 = "raji11";
	    String s2 = "rajiis";
		
	    if(pattern(s1)||pattern(s2)) {
	    	
	    	System.out.println("spl");
	    }
	    
	    
	    else {
	String [] sp=s1.split("\\s+");
	String []sp2=s2.split("\\s+");
	 HashMap<String, Integer> mp = new HashMap<>();
     HashMap<String, Integer> mp2 = new HashMap<>();
     
     
     for(String st:sp) {
    	 
    	 
    	 mp.put(st,mp.getOrDefault(st, 0)+1);
     }
    for(String st1:sp2) {
    	 
    	 
    	 mp2.put(st1,mp2.getOrDefault(st1, 0)+1);
     }
	
  boolean t=  mp.equals(mp2);
	if(t) {
		
		 System.out.println("having same words");
		
	}
	else {
		 System.out.println(" Not having same words");
	}
	
	    }
	
	
}
}