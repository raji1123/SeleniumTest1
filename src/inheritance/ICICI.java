package inheritance;

public class ICICI implements RBI{

	public static void main(String[] args) {
	RBI s=new ICICI();

		s.account();
		s.interest();
		s.loan();
		///s.creditcard();

	}

	@Override
	public void loan() {
		System.out.println("gold and car loan");
		
	}

	@Override
	public void interest() {
		System.out.println("5 percent interest");
		
	}

	@Override
	public void account() {
		System.out.println("savings and salary account");
		
	}
	
	public void creditcard() {
		System.out.println("credit card ");
		
	}

}
