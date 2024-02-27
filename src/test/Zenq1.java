package test;
import java.util.Scanner;
public class Zenq1 {

	public static void main(String[] args) {
		Zenq1 s1=new Zenq1();
		s1.abi();
	}

	
	public void abi() {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
	
		
		for(int i=m+1; i<=n-1;i++) {
			
			System.out.print(i);
			
			if(i!=n-1) {
				System.out.print(" ");
			}
		}
		
		
		
	}
}
