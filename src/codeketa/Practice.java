package codeketa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		
		
		Map<String,Integer> mp =new HashMap<String,Integer>();
		
		
		String arry[]= {"java","code","code"};
		
		for(String s:arry) {
			
			if(mp.containsKey(s)) {
				
				mp.put(s, mp.get(s)+1);
			}
			
			else {
				
				mp.put(s, 1);
			}
		
			
		}
		
		
		System.out.println(mp.keySet()+""+mp.values());
		
		for(Entry<String,Integer> pl:mp.entrySet()) {
			
			if(pl.getValue()>1) {
				
				System.out.println("Duplicate values found"+" "+pl.getKey());
				
				
			}
			
		}
		
	}}
