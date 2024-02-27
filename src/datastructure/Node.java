package datastructure;

public class Node {

	int data;
	Node next;
	
	Node(int data){
		
		
		this.data=data;
		this.next=null;
	}
	
	
	
	public static void main(String[] args) {
		
		
		Node a=new Node(4);
		Node b=new Node(14);
		
		a.next=b;
		System.out.println(a.data);
	
		System.out.println(a.next.data);
		
		
		//add
		//remove
		//get
	}
}
