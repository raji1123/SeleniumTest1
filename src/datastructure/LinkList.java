package datastructure;

public class LinkList {

	private  Node head;
	
	private  Node tail;

	private  int size;

	LinkList(){
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
	
	public int getsize() {
		
		
		return size;
	}
	
	
	public  void addAt(int data,int index) throws Exception {
		
		if(index<0||index>size) {
			
			
			
			throw new Exception("index outofbound");
		}
		
		
		if(index==0) {
			addfirst(data);
		}
		
		else if(index==size) {
			
			addlast(data);
		}
		
		else {
			
			Node temp=head;
			
			for(int jump=1;jump<index;jump++) {
				temp=temp.next;
				
			}
			
			
			
			Node n=new Node(data);
			n.next=temp.next;
			
			temp.next=n;

			size++;
			
		}
		
	}
	
public void addlast(int  data) {
		
		Node n=new Node(data);
		
		if(size==0) {
			
			head=tail=n;
		}
	  tail.next=n;
	  tail=tail.next;
	  size++;
		
		
	}
	
	
public int getfirst() throws Exception {
	
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


public int getmiddle(int index) throws Exception {
	
	if(size==0) {
		throw new Exception("list is empty");
		
		
	}
	
	Node temp=head;
	
	for(int jump=1;jump<=index;jump++) {
		temp=temp.next;
		
	}
	
	
	
	
	return temp.data;
	
}







	
	public void display() {
		
		Node temp=head;
		while(temp!=null) {
			
			System.out.print(temp.data+"->");
			temp=temp.next;
			
		}
		
		System.out.println("");
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		LinkList li=new LinkList();
		
		
		li.addfirst(10);
		
		li.addfirst(20);
		
		li.addfirst(30);
		
		li.addlast(100);
		li.addlast(200);
		
		
		li.display();
		li.addAt(5,0);
		li.display();
		li.addAt(3, li.getsize());
		li.display();
		li.addAt(100, 4);
		li.display();
		System.out.println(li.getsize());

	}

}
