package errors;

public class MyOwnException extends Exception{//create the constructor//exception is a parent of all exceptionss..
	
	public MyOwnException(String s) {//constructor
		super(s);
		System.out.println("Own Exception");
	}

}
