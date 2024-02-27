package patternpractice;

public class NonStatic {
	
	static int a=2;
	static int b=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(b);
		
		NonStatic obj1 = new NonStatic();
		NonStatic obj2 = new NonStatic();
		NonStatic obj3 = new NonStatic();
		NonStatic obj4 = new NonStatic();
		obj1.method();
		obj2.method();
		obj3.method();
		obj4.method();
		
		System.out.println(obj1.a);
		System.out.println(NonStatic.b);
		
	} 
	
	public void method() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		a+=10;
		b+=10;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("-------");
	}
	
	public static void addSugar() {
		System.out.println(b);
	}
	
	
	

}
