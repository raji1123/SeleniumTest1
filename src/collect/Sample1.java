package collect;

import java.util.*;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> obj = new ArrayList<Object>();
		
		
		//add
		//remove
		//get
		//size
		
		obj.add(2);
		obj.add('*');
		obj.add(false);
		obj.add("hello");
		obj.add(123.56);
		obj.add(3.14F);
		
		obj.add(2,"testing..");
		
		//String s = (String)obj.get(4);
		

		System.out.println(((String)obj.get(4)).length());
		
		
		for (Object str : obj) {
			System.out.println(str);
		}
		System.out.println(obj.size());
		
		System.out.println(obj.get(3));
		
		obj.remove(3);
		System.out.println("One element got removed");
		
		/*Iterator<Object> i = obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		
		
		
		
		
	}

}
