package patternpractice;

public class ConsPratce {

	int rollno;
	String name;
	String dep;
	
	
	//default  -system will automati with no code.
	// zero parameter - 
	// parameterised constructor - 
	
	//Scope of variable-1.global 2.local 3.static
	
	
	
	//heap --//stack--   obj store in stack//metaspace-static store in metaspace
	
	//static -variable we can access easily it present in metaspace and non-matic
	
	
	//static variables can  access in both static and non-static
	//static method only access static variables..

	public static void main(String[] args) {
		ConsPratce a=new ConsPratce (1,"abi","cs");//
		a.method();
		ConsPratce a1=new ConsPratce (2,"deepi","cs");//
		a1.method2();
		
		ConsPratce a2=new ConsPratce (2,"cs");//
	}

	
	public ConsPratce(int a,String s,String d) 
	{
	
		System.out.println("constructor");
		rollno = a;
		 name= s;
		 dep = d;
	}
	
	public ConsPratce(int a,String s) 
	{
	
		System.out.println("constructor");
		rollno = a;
		 name= s;
	//	 dep = d;
	}
	
	public void method() {
		System.out.println("Student-1");
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(dep);
	}
	public void method2() {
		System.out.println("Student-2");
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(dep);
	}
}
