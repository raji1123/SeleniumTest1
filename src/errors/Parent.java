package errors;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		p.fun1();
	}

	public Parent() {
		System.out.println("Constructor from Parent");
	}
	
	public void fun1() {
		System.out.println("Parent Method");
	}
}

