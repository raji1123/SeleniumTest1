package collect;

import java.util.*;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//put(k,v)
				//remove(k)
				//get(k)
				//size()
		
				//Iterator won't work

	//	Map<Integer,Object> obj = new HashMap<Integer,Object>();//-Ascending order/nullvalue allowed nullkey both allowed
		
		//Map<Integer,Object> obj = new TreeMap<Integer,Object>();//-Ascending order-nullvalue allowed nullkey not allowed
		
	Map<Integer,Object> obj = new Hashtable<Integer,Object>();//dsecending order-nullvalue and nullkey not allowed
		
		
		obj.put(3, 123);
		obj.put(1, "name");
		obj.put(5, 344);
		obj.put(6, null);
		obj.put(null, 123);
		obj.put(5, 789);
		
		//System.out.println(obj.get("val1"));
		//obj.remove("val2");
		System.out.println(obj);
		
		
		
		/*for (Map.Entry<Integer, Object> m : obj.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			System.out.println(m);
		}*/
		
		
		
	}

}
