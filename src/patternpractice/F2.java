package patternpractice;

public class F2 {

	public static void main(String[] args) {//1.no parameters no return type
		// TODO Auto-generated method stub
		F2 s=new F2();
	
	s.area();
		s.num();
	
		
	}
	public void area( ) {
		
	 System.out.println("rajii ");
	
	}
	public void num() {
		System.out.println("rajii pradeep");
		 
		
		
		F2 s=new F2();
		
		/*s.area(2,3);
		s.num(2,3);
	
		
	}
	public void area(int a,int b ) {//passing parameters and no return type
		
	 System.out.println(a+b);
	
	}
/*	public void num(int a,int b) {
		System.out.println(a*b);
		
		s.area(2, 3,"raji");
		s.area(2, 2,"pradeep");
		s.area(2);
		s.area(10);
		
	
		
	}*/
	public void area(int l,int b,String name) {//passing parameters and no return type
		
		System.out.println(name+"area of the rectangle"+l*b);
	}
	public void area(int a) {
		
		System.out.println("area of the square"+a*a);
		
		
		
		
		
		
}
}
