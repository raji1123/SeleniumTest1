package errorhandling;

import java.util.Scanner;
public class Q2 {


	public static void main(String[] args) throws MyOwnException  {
		
		 Q2 s=new  Q2();
         
			s.m1();
		
		
	}
	

	public void m1() throws MyOwnException  {
		int a=11;
		
		if(a>10) {
			throw new MyOwnException("a should not greater than 10");
		}
		System.out.println(a);
		
		
	}







}
