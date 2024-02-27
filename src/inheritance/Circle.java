package inheritance;

public class Circle extends Shapes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes obj = new Circle();
		
		obj.start();
		obj.area();
		
	}

	
	public void area() {
		System.out.println("Area of a Circle.");
	}
	
}
