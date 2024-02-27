package inheritance;

public class BMW extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW obj1 = new BMW();
		obj1.start();
		obj1.stop();
		obj1.wheel();
		obj1.airbag();             //obj1.wheel(); both method present in child and parent so it will take method in child is it latest /updated one 
		
		System.out.println("-------------------");
		
		Car obj2 = new Car();
		obj2.start();
		obj2.stop();
		obj2.wheel();

		System.out.println("-------------------");
		
		//top casting  -- 
		//down casting  -- not possible
		
		Car obj3 = new BMW();  // top casting
		obj3.start();
		obj3.stop();
		obj3.wheel();
		
		
	}
	
	public BMW() {
		System.out.println("Constructor from BMW");
	}

	public void airbag() {
		System.out.println("Airbag");
	}
	
	public void wheel() {
		System.out.println("Tubeless tyre-Wheel");
	}
	
}
