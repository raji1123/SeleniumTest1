package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";
		String s1="abc";
		//sort method
		
		s.compareTo(s1);//+ - values
		
		//int a[]= {3,4,5,6,7};
	//Arrays.sort(a,(a1,b1)-> Integer.compare(a1-b1));

		ArrayList<Integer> li=new ArrayList<>();
		
		li.add(10);
		li.add(101);
		li.add(110);
		li.add(1101);
		li.add(210);
		li.add(410);

	/*	Collections.sort(li,new Comparator<Integer>() {
			public int compare(Integer a,Integer b) {
				
				
				return a-b;
				
				
				
				
			}
			
			
			
		});*/
		
		
		Collections.sort(li,(a,b)-> -(a-b));
		
		
		
		
		
		
		
		
		for(Integer l:li) {
			
			
			System.out.println(l);
		}
		
		
		
	}

	public static void sort(int value, Object object) {
		// TODO Auto-generated method stub
		
	}

	
}
