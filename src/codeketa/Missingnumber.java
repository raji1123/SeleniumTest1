package codeketa;
import java.util.Scanner;

public class Missingnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			
	
		}
		//int a[]= {6,7,9,10};
		int sum1=0;
		int sum2=0;
		int num = 0;
		for(int i=0;i<a.length;i++) {//sum1=11
			//sum2=1+2+3+4
			sum1=sum1+a[i];
	
		}
		for(int i=6;i<=10;i++) {
			sum2=sum2+i;
			num=sum2-sum1;
	
		}
	System.out.println(num);

}}
