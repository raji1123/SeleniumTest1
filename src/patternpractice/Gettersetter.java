package patternpractice;

public class Gettersetter {
	private int value=10;
	public static void main(String[] args) {
	//int value=0;
		Gettersetter s=new Gettersetter();
		
		//a.setter(60); // setting the data
		//System .out.println(a.getter());//
		Function s1=new Function();
		//s1.add(0, 0);
	
		s.setter(20);
		s.raji();
		
		System.out.println(s.getter());
		
		s.aji();
		System.out.println(s.getter());

	}




	public int getter() {
		
		int a=value;
		return a;
		
	}
	
	
	public void setter(int a) 
	{
		
	value = a;
			
	}
	
	public int raji() {
		//return value=value*2;
		return value=value*4;
		
	}
	
	public int aji() {
		return value=value*2;
		//return value=value/2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}