package errors;



public class Excep {

	public void Array() {
		String d="567eee";
int a1=1	;	


// throws -> it will throw the exception to the calling method
// throw  -> will create a new exceptions.



int x[]=new int[3];
try
{
	x[0]=1;
	x[1]=1;
	x[2]=1;
	x[3]=1;
}catch(ArrayIndexOutOfBoundsException e) {
e.printStackTrace();
}




		try {
			System.out.println(a1);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
		try {
		int a=2;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch( ArithmeticException e) {
			e.printStackTrace();
		}
		
		try {
			int c = Integer.parseInt(d);
			System.out.println(c);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			
		}
		
		
			
			System.out.println("String");
				
		
		
	}
//	int b1[]=new int[3];
	
	public void m1(){
		int b1[]=new int[3];
		
		System.out.println("array");
		
	}

	
	
	
	
	
	
	public static void main(String[] args) {
	
		Exception s=new Exception ();
		s.Array();
		s.m1();
		
		
	}

}
