package inheritance;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.wheel();
		c.start();
		c.stop();
		
	}
	
	public Car() {
		System.out.println("Constructor from CAR");
	}

	public void wheel() {
		System.out.println("Wheel");
	}
	
	public void start() {
		System.out.println("Start");
	}
	
	public void stop() {
		System.out.println("Stop");
	}
	
}
