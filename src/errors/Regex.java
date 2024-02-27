package errors;

import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pattern
		//Matchers
		
		//regular expression
		
		boolean result;
		
		Pattern pat = Pattern.compile(" raji");  // search key word
		Matcher mat = pat.matcher("Hello World");  // context
		
		result = mat.find();
		
		System.out.println(result);
		
		
		
		String a = "hello";
		
		StringBuilder obj = new StringBuilder(a);
		System.out.println(obj.reverse());
		
		
		char[] b = a.toCharArray();
		
		for (int i = b.length-1 ; i>= 0 ; i--) {
			System.out.print(b[i]);
		}
		
		System.out.println();
		
		System.out.println(a);
		String c = a.replace('l', 'z');
		System.out.println(c);
	}

}
