package datastructure;

public class Practicelinbkedlist {
	private Node head;
	private Node tail;
	private int size;
	
	
	Practicelinbkedlist(){
		
		head=tail=null;
		size=0;
	}
	
	public void addfirst(int data) {
		
		
		Node n=new Node(data);
		n.next=head;
		head=n;
		if(size==0) {
			
			tail=n;
			
		}
       		
		size++;
	}
	
	
public void addlast(int data) {
		
		
		Node n=new Node(data);
		
		if(size==0) {
			
			head=tail=n;
			
		}
		tail.next=n;
		tail=tail.next;
		size++;
	}
	
	
public void addAt(int index,int data) throws Exception {
	
	
	if(index<0||index>size) {
		
		throw new Exception("index out of bound");
		
		
	}
	
	
	if(index==0) {
		addfirst(data);
		
	}
	
	
	if(index==size) {
		addlast(data);
	}
	else {
		
		Node temp=head;
		
		
		for(int i=1;i<index;i++) {
			
			temp=temp.next;
		}
		Node n=new Node(data);
		n.next=temp.next;
		temp.next=n;
		size++;
	}
	
	
	
	
	
}




public  int getfirst() throws Exception {
	
	if(size==0) {
		throw new Exception("list is empty");
	}
	
	return head.data;
	
}
public int getlast() throws Exception {
	
	if(size==0) {
		throw new Exception("list is empty");
	}
	
	return tail.data;
	
}



public int getindexdata(int index) throws Exception {
	
	if(size==0) {
		throw new Exception("list is empty");
		
	
	}
	
	Node temp=head;
	for(int i=1;i<=index;i++) {
		
		temp=temp.next;
		
	}
	
	
	return temp.data;
}


public int removefirst() throws Exception {
	
	if(size==0) {
		throw new Exception("list is empty");

	}
	int output=head.data;
	if(size==1) {
		
		head=tail=null;
		size=0;
	}
	else {
		
		head=head.next;
		this.size--;
	}
	
	
	return output;

	
}



public int removelast() throws Exception {
	
	if(size==0) {
		throw new Exception("list is empty");

	}
	int output=head.data;
	if(size==1) {
		
		head=tail=null;
		size=0;
	}
	else {
	Node temp=head;
	
	while(temp.next!=tail) {
		
		temp=temp.next;
		
	}
		
	temp.next=null;
	tail=temp;
	
	
	
	size--;
	
		
			}
	
	
	return output;

	
}




public int removelastindex(int index) throws Exception {
	
	
	
if(index<0||index>size) {
		
		throw new Exception("index out of bound");
		
		
	}
	

if(index==0) {
	return removefirst();
	
}
	


if(index==size-1) {
	return removelast();
	
}




else {
	
	Node temp=head;
	
	for(int i=1;i<index;i++) {
		
		temp=temp.next;
	}
	
	Node output=temp.next;
	
	temp.next=output.next;
	
	size--;
	return output.data;
	
	
}
	
	
	
	
	
	
	
}



public void display() {
	
	
	Node temp=head;
	
	while(temp!=null) {
		
		System.out.print(temp.data+" ->");
		temp=temp.next;
	}
	
	System.out.println();
}


public int getsize
() {
	
	return size;
}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Practicelinbkedlist li=new Practicelinbkedlist();
		
		
		li.addfirst(10);
		
		li.addlast(100);
		li.addlast(3000);
		li.addlast(10);
		li.addAt(1, 200);
		System.out.println(li.removelastindex(2));
		li.display();
		
		//li.display();
		
		//System.out.println(li.removefirst());
		
		//li.display();
	//	System.out.println(li.removelast());
		//li.display();
		
		
		
	//System.out.println(li.getfirst());
	
	//System.out.println(li.getlast());
	
	
	//System.out.println(li.getindexdata(1));
	
	//System.out.println(li.getsize());
	
	}

}
