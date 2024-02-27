package arrayQues;

import java.util.HashMap;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="my name is raaji";
		String s2="raaji is name my";
		HashMap<String,Integer> mp=new HashMap<>();
		HashMap<String,Integer> mp2=new HashMap<>();
		
		
		String set[]=s.split(" ");
		String se2[]=s2.split(" ");
		
		for(String m:set) {
			
			
			mp.put(m,mp.getOrDefault(m,0)+1);
			
		}
		
for(String m2:se2) {
	
			mp.put(m2,mp.getOrDefault(m2,0)+1);
			
			
		}
		
boolean reault=mp.equals(mp2);



if(reault) {
	
	
	 System.out.println("The strings have the same words with the same frequency.");
} else {
    System.out.println("The strings do not have the same words with the same frequency.");
}


		
	}

}
