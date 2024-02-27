package patternpractice;

public class Primenumber {

	public static void main(String[] args) {
		int a=20;
		int count=0;
		if(a>1) {
			for(int i=1;i<=a;i++) {
				if(a%i==0) 
					count++;
			}
				if(count==2) {
					System.out.println("prime number");}
				
					else {
						System.out.println("not a prime number");
					}
				
			
				if(a%2==0) {
					System.out.println("even number");
				}
				else{
					System.out.println("odd number");
				}
				
		}}}


		



	

