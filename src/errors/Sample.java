package errors;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample obj = new Sample();
		
		//obj.method1();
		
		try {
			obj.method2();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		try {
			obj.method2();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void method2 () throws NumberFormatException, NullPointerException{       
		
		
		
										//exception I/O exception/SQL exception-
		                                //class not found exception 
		                                //arthemetic/null pointer /number pointer /array index out of bound
		
		System.out.println("Sample line in method-2");//error --stack overflow/JVM error//out of memory error
		
		
		String s = "1234xyz";
		int c = Integer.parseInt(s);
		System.out.println(c);
		
		
		String s1=null;
		int c1=s1.length();
		System.out.println(c1);
	}
	
	
	
	public void method1() {
		
		String s = "1234xyz";
		
		
		try {
			int c = Integer.parseInt(s);
			System.out.println(c);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		
		
		
		System.out.println("Sample line in method-1");
		
		
	}

}
