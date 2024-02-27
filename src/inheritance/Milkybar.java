package inheritance;

public class Milkybar extends Chocolate  {

	public static void main(String[] args) {
		Milkybar obj=new Milkybar();
		obj.cream();
		obj.milk();
		obj.lesssucrose();
		obj.nohighfructosecornsyrup();
		obj.lesssugar();
	}

	@Override
	public void milk() {
		System.out.println(" milkybar-50% milk");
		
	}

	@Override
	public void lesssugar() {
		System.out.println("milkybar-24% sugar");
		
	}

	@Override
	public void lesssucrose() {
		System.out.println("milkybar-2%sucrose");
		
	}

	@Override
	public void nohighfructosecornsyrup() {
		System.out.println("milkybar-zeroHFCS");
		
	}

}
