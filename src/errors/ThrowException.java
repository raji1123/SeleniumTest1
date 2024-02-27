package errors;

public class ThrowException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ThrowException obj = new ThrowException();
		try {
			
			obj.add();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//MyOwnException
	public void add() throws MyOwnException {
		int a = 19;
		if (a >10) {
			throw new MyOwnException("a should lesser than 10");
		}
		System.out.println(a);
		
	}

}
