package errors;

public class PrtceExp {

	
	
	 
		
	public	void m1() {
			
		String s = "1234";
		int c = Integer.parseInt(s);
		System.out.println(c);
			
		}
		
	public	void m2(){
		
		String s1=null;
		int c1=s1.length();
		System.out.println(c1);
		
	}

	public void add() throws Exception	{
	
	

	try {
		m1();
		m2();
	} catch (NullPointerException Exception ) {
		
	}

	
}
	
	
	
	public static void main(String[] args) throws Exception {
		
		PrtceExp s=new PrtceExp ();
		
		s.add();
		
		
	
	
}}
