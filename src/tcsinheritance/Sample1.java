package tcsinheritance;


 class A {
	
	 int a,b;
	 void add() {
		 
		 
		System.out.println(a+b);
	 }
	
}
 
 class B extends A{
	 
	 void diplay() {
		 
		 System.out.println("added");
		 
	 }
 }






public class Sample1 {
	public static void main(String[] args) {
		
		B obj=new B();
		obj.add();
		obj.diplay();

	}

}
