package codeketa;

public class Sumofdigits {

	public void m2(){
		
		int a=123;
	int m;
	int sum=0;
		
		while(a!=0) {
			m=a%10;
			sum=sum+m;
			a=a/10;
			
		}
		System.out.println(sum);
	}
	
	
	
	
	public static void main(String[] args) {
	
		Sumofdigits r=new Sumofdigits();
		r.m2();
		
	}

}
