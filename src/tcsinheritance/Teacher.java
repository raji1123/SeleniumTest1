package tcsinheritance;

class Teacher1{
	
	 static String Designation="teacher";
	 static 	String collegename="ngm collgse";
	 int a=5;
	 void teaching() {
		 
		 System.out.println("teachimng");
	 }
	void diplay(){
		System.out.println(Designation+" "+collegename);
		
	}

}


class CSTeacher extends Teacher1 {
	
	
	
	int a=20;
	
 void teaching() {
		 
	      super.teaching();
		 System.out.println("computerscience");
		 System.out.println(super.a);
	 }
 void diplay(){
		System.out.println(Designation+" "+collegename);
		
	}
	
}



public class Teacher {

	public static void main(String[] args) {
		
		CSTeacher c=new CSTeacher();
		c.teaching();
		c.diplay();
		

}}
