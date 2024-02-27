package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> mp=new HashMap<>();
		
		mp.put("raji", 1);
		mp.put("abi", 2);
		mp.put("nivi", 3);
		
		
		for(Entry<String, Integer> m:mp.entrySet()) {
			
			System.out.print(m.getKey());
			System.out.print(m.getValue());
		}
		
		for(String key:mp.keySet()) {
			System.out.println(key);
			
		}
		
		
		for(Integer value:mp.values())
		{
			System.out.println(value);
			
			
			
		}
		
		
		
	}

}
