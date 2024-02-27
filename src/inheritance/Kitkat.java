package inheritance;

public class Kitkat extends Chocolate{

	public static void main(String[] args) {
		//Chocolate obj=new Milkybar();//only we can access the parent  class methods bcoz we creating object and assigning to parent class
		//Chocolate obj1=new Kitkat();
		
		
		Kitkat obj2=new Kitkat();

      obj2.doublechocolate();
      obj2.lesssucrose();
      obj2.lesssugar();
      obj2.milk();
      obj2.nohighfructosecornsyrup();
      
      System.out.println(" ------");
      Chocolate obj1=new Kitkat();
      
		Milkybar obj3=new Milkybar();
		
		
	}

	
	public void milk() {
		System.out.println("kitkat-milk-less than 30%");
	}


	@Override
	public void lesssugar() {
		System.out.println("kitkat-sugar 25%");
	}


	@Override
	public void lesssucrose() {
		System.out.println("kitkat-2% sucrose");
		
	}


	
	public void nohighfructosecornsyrup() {
		System.out.println("kitkat -zero HFCS");
		
	}
	 public void doublechocolate() {
		 System.out.println("100% chocolate -kitkat");
	 }
	
	
	
}
