package patternpractice;

public class Practiceobj
//Encapsulation-Getter and Setter Methods"
{
	String s=" pradeep";
	
	int value = 0;
	
	public static void main(String[] args) {
		
		

		Practiceobj a=new Practiceobj();
		Practiceobj b=new Practiceobj();
		
		
		//System .out.println(a.s);
		//a.lift();
	
	
		a.setter(60); // setting the data
		System .out.println(a.getter());
		
		b.setter(100); // setting the data
		System .out.println(b.getter());
		
		//System.out.println(a.value);
		//System.out.println(b.value);
		
		

}
	
	public int getter() {
		//System.out.println("USed to get the data from the system.");	
		int x = value;
		return x;
	}
	
	public void setter(int x) {
		//System.out.println("USed to store the data into the system.");	
		value = x;
	}
	
	public int manu() {
		return value = value * 2;
	}
public void lift() {
	
	System .out.println("software");
	
}

}
