package tcsinheritance;

class SBI{
	
	
	void interestloan() {
		
		System.out.println("1%");
	}
}
class ICICI extends SBI{
	
	
	void interest() {
		
		System.out.println("2%");
	}
}



public class Inheritance {

	
	int a=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICI obj=new ICICI();
		
		obj.interestloan();
	}

}
