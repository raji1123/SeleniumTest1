package test;
import java.util.Scanner;

public class Loophcf {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int min=0;
		if(a<b) {
			min=a;
		}else
		{
		min=b;
		}
		
		for(int i=min;i >=0;i--) {
			
			if(a%i==0 && b%i==0) {
				System.out.print(i);
				break;
			}

	}
		}}


