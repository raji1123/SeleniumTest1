package arrayQues;

public class Hashstackneedle {

	
	public void meth1() {
		
		
		String s1="hashstak";
		String s2="stak";
		
		for(int i=0; i<s1.length();i++) {
			
			
			if(s1.charAt(i)==s2.charAt(0)) {
				
				int k=i;
				int j = 0;
				
				while(j<s2.length()&&k<s1.length()&&s2.charAt(j)==s1.charAt(k)) {
					
					j++;
					k++;
				
				}
			
			
		   if(j==s2.length()) 
		   { 
		               System.out.println(i); // return i;
	       }
		   
		 
		
	
	
			}}
		
	}
	
	
	
	
	public static void main(String[] args) {
		Hashstackneedle str= new Hashstackneedle();
		//System.out.println(str.meth1("Hashtack", "htack"));
		
        str.meth1();
	}

}
