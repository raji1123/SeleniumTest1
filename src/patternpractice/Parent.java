package patternpractice;

public class Parent {
	
	int age;
	String name;
	int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent(18,"random",12345);
		p1.method();
		
		Parent p2 = new Parent(18,"random",12345);
	
	}
	
	
	public Parent(int a, String s, int n) {
		System.out.println("Constructor-start");
		age = a;
		name = s;
		number = n;
		System.out.println("Constructor-end");
	}
	
	
	public void method() {
		System.out.println("Sample Method");
		System.out.println(age);
		System.out.println(name);
		System.out.println(number);
	}

}
