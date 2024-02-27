package inheritance;


public class Child {
	
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.setter(65);
		c.getter();
	}

	
	
	public void setter(int age) {
		System.out.println("Child Method");
		this.age = age;
	}
	
	public void getter() {
		System.out.println(age);
	}

}
