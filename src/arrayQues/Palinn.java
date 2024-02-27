package arrayQues;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palinn {

	static boolean pattern (String s) {
		
		Pattern pa=Pattern.compile("[^a-zA-Z0-9\\s]");
		
		Matcher matcher=pa.matcher(s);
		return matcher.find();
	
		
	}
	
	
	
	static boolean specialcharacter(String s) {
		
		
		for(char ch:s.toCharArray()) {
			
			
			if(!(Character.isLetter(ch)||Character.isWhitespace(ch)||Character.isDigit(ch))) {
				
				return true;
				
			}
		}
		
		
		
		
		return false;
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		String s="my name is raaji";
		String s2="raaji is name my.";
	//	String s3=s2.toLowerCase();
		
		
		if(specialcharacter(s)||specialcharacter(s2)) {
			
          
			

				System.out.println("contains spl chARCTER");
			
		
		}
		else {
		HashMap<String,Integer> mp=new HashMap<>();
		HashMap<String,Integer> mp2=new HashMap<>();
		
		
		String set[]=s.split(" ");
		String se2[]=s2.split(" ");
		
		for(String m:set) {

			mp.put(m, mp.getOrDefault(m, 0) + 1);

		}

		for (String m2 : se2) {

			mp2.put(m2, mp2.getOrDefault(m2, 0) + 1);

		}

		boolean reault = mp.equals(mp2);

		if (reault) {

			System.out.println("The strings have the same words with the same frequency.");
		} else {
			System.out.println("The strings do not have the same words with the same frequency.");
		}
	}

	}



}
