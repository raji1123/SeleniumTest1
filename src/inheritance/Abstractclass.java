package inheritance;


	
interface A{
	
	void watermeloan();
	
}

 class A2 implements A{

	@Override
	public void watermeloan() {
		System.out.println("fruits");
		
	}
	
	
	
	
	public static void main(String args[]){
		
		A2 obj=new A2();
		
		obj.watermeloan();
	}
}