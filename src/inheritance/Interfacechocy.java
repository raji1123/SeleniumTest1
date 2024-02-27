package inheritance;

class A1
{
	void A1() {
		System.out.println(" class A1 ");

	}
	
}

interface A{
	
	int a=2;//by default variable should be static and final// multiple inheritance
	void lemonflavor();
	 
	
}

interface B {
	
	void strawberryflavor();
}
interface C {
	
	static  String baseurl="www.amazon.com";
	
	
	void berryflavor();
}


public class Interfacechocy extends A1 implements A,B,C{

	
	
  


	public static void main(String[] args) {
		
		Interfacechocy obj=new Interfacechocy();
		
		System.out.println((obj.baseurl));
	}

	@Override
	public void strawberryflavor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lemonflavor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void berryflavor() {
		// TODO Auto-generated method stub
		
	}



	
	
	



}
