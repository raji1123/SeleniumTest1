package collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//ctrl + shift + O

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//add
				//remove
				//get  -- not allowed
				//size

		Set<Object> obj = new HashSet<Object>();
		
		obj.add(2);
		obj.add('*');
		obj.add(false);
		obj.add("hello");
		obj.add(123.56);
		obj.add(3.14F);
		
		
		System.out.println(obj.size());
		
		obj.add("false");
		obj.add("hello");
		obj.add(123.56);
		
		System.out.println(obj.size());
		
		for (Object str : obj) {
			System.out.println(str);
		}
		
		obj.remove(123.56);
		System.out.println("One element got removed");
		for (Object str : obj) {
			System.out.println(str);
		}
		
		obj.remove('*');
		System.out.println("One element got removed");
		Iterator<Object> i = obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
