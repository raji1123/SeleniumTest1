package patternpractice;

public class Lilly extends Rose{
public static void main(String[] args) {
		
		Lilly f=new Lilly();
		f.name();
		f.name2();
		//f.add();
		//f.multiply();
		f.fog1();
		f.fog2();
	}

public void name() {
	
	System.out.println("ferg");
	
}
	
	public void fog1() {
		
		System.out.println("perfume1");
		
	}
   public void fog2() {
	System.out.println("perfume 2");
		
	}
}