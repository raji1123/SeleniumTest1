package datastructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//colletion framework package contains-a set of interface
		//inplementation classes
		//algorithm(searching and sorting)
		
		
		//ArrayList-maintain insertion order//add or remove element//index based 
		//Empty arrayList -intial capacity-10
		
		List<Integer> li=new ArrayList<>();
		
		ArrayList<Object> arr=new ArrayList<> ();
		
		arr.add("dghsgd");
		arr.add(1);
		
		
		//LinkedList
		
		
		LinkedList <Integer>li2=new LinkedList<>();
		li2.addFirst(2);
		
		li2.poll();
		
		
		
		//Queue
		
		
		Queue<Integer> q=new LinkedList<>();
q.add(1);
q.add(10);
q.add(14);
q.add(15);

//System.out.println(q);

	while(!q.isEmpty())	{
		
		//System.out.println(q.poll());
		
		//System.out.println(q.peek());
		
		
	}
		
	
	
	//Arraydeque
	
	
	ArrayDeque<Integer> dq=new ArrayDeque<>();
	
	
	
	
	dq.offerFirst(1);
	dq.offer(2);
	dq.offerFirst(5);
	dq.offerFirst(6);
	
	
	for(int v:dq) {
		System.out.println(v);

	}
	
	
	
	
	//PriorityQueuq
	
	Queue<Integer> d=new PriorityQueue<>();
	
	d.offer(0);
	d.offer(10);
	d.offer(20);

	d.offer(2);

	System.out.println(d);
	
		
	}

}
