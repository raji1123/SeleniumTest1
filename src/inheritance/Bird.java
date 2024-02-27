package inheritance;

  class Base {
	  
	  
	  void method(int a) {
		  
		  System.out.println("base class a="+a);
			  
	  

  }
	
	  
	class child extends Base  {
		
		void method(double d) {
			System.out.println("base class d="+d);
			
			
		
		
	}}
  public class main{
	public static void main(String[] args) {
		Base s=new child();
		s.method(10);
		
		
			}

}}
