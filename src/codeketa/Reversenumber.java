package codeketa;
import java.util.Scanner;
public class Reversenumber {

	
	public void m1(){
    Scanner s=new Scanner (System.in);
		
		System.out.println("enter the number");
		int num=s.nextInt();
		
		
		int rev=0;
		while(num!=0) {
			
			rev=rev*10+num%10;//1234%10=4  2.40+123%10 3.43*10=430+2=432*10=4320+1=4321
			num=num/10;//1234/10=123=12=1
			
		}
		System.out.println(rev);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Reversenumber obj=new Reversenumber();
		obj.m1();

	}

}
