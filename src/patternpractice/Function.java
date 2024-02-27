package patternpractice;

public class Function {
	int a=1;int b=2;;;
	public static void main(String[] args) {
		
		Function s1=new Function();//class name should be same for the syntax and 
		//day s1=new day();
		s1.add(10,20);
		s1.sub();
		s1.multiply();
		s1.div();
		s1.star("pradeep");
	}
	
	private void add(int a,int b) {
		//we can pass parameter 
	 
	 System.out.println(a+b);
	}
	public void sub() {
		 
		 System.out.println(a-b);
}
	public void multiply() {
	
		 System.out.println(a*b);}
	public void div() {
	
	System.out.println(a/b);}
	public void star(String name) {
		
		 System.out.println("my name is raji"+name);}
	

}