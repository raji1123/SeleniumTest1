package errors;

public class Expc1 {

	public static void main(String[] args) throws InterruptedException  {
		

		try {
		String s = "123";
		int c = Integer.parseInt(s);
		System.out.println(c);}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try{
		String s1="abi";
		int c1=s1.length();
		System.out.println(c1);}
		catch(Exception e) {
			System.out.println("exception found");
		}
				
Thread.sleep(5000);
		
		
		String s2 = "123";
		int c1 = Integer.parseInt(s2);
		System.out.println(c1);

}}
