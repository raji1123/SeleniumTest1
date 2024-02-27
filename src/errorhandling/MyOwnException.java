package errorhandling;

public class MyOwnException extends Exception{

	public MyOwnException (String s){
	super(s);
		System.out.println("Own Exception");
		
	}

}
