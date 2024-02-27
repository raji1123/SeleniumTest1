package patternpractice;

public class Super2 extends Superkey{

	
	void bark() {
		{System.out.println("barking...");}  
		 super.eat();
	}
	
	
	
	public static void main(String[] args) {
		
		
		 Super2 s1=new  Super2 ();
		 s1.bark();
		
		
	}

}
