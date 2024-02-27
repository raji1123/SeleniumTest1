package inheritance;

	public class SBI implements RBI{
		
	public void loan() {
		System.out.println("home loan");

		
	}

	@Override
	public void interest() {
		System.out.println("1 percent interest");
		
	}

	@Override
	public void account() {
		
		System.out.println("savings account");

	}

	public static void main(String[] args) {
	RBI s=new SBI();
		s.account();
		s.interest();
		s.loan();
		
	}
	
	
	
	
	}
