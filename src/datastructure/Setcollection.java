package datastructure;

import java.util.HashSet;
import java.util.Set;

public class Setcollection {

	String bookname;
	int sno;
	int price;
	
	
	public Setcollection(String bookname,int sno,int price) {
		
		this.bookname=bookname;
		this.sno=sno;
		this.price=price;
	}
	
	
	public String display() {
		
		
		return bookname+ ""+sno+""+price;
		
		
		
	}
	
	
	
}
