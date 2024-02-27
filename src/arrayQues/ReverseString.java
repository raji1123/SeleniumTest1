package arrayQues;

public class ReverseString {

	int count=0;
	void primenumber(int num) {
		
	if(num>1) 
	{
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count==2) {
				
				
				System.out.println("prime number");
				
			}
		
			else
			{
				System.out.println(" Not a prime number");
				
			}
		
		}
	
		
		else {
			System.out.println(" Not a prime number");
			
		}
		
	}
		
		
		
	void pattern() {
		int n=5;
		for(int r=1;r<=2*n-1;r++) {
			
			int totalcol=(r>n)?2*n-r:r;
			for(int c=1;c<=totalcol;c++) {
				
				System.out.print("*");
			}
			

			
			System.out.println();
		}
		
	}
	
	void stringreverse() {
		
		String s="welcome to java";
		
		String [] w=s.split(" ");
		
		String rev="";
		for(String r:w) {
			
			String revwrd="";
			for(int i=r.length()-1;i>=0;i--) {
				revwrd=revwrd+r.charAt(i);
				
			}
			rev=rev+revwrd+" ";
		}
		
		System.out.println(rev);
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		
		
	}
	
	
	
	
	
	void swap() {
		
		
		int a=1;
		int b=2;
		int c;
		
		/*c=a;
		a=b;
		b=c;*/
		b=(a+b)-(a=b);
		
		
		
		
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	void number(int n) {
		int rev = 0;
		
		while(n!=0) {
			
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}
	
	
	void count(int n) {
	int	count=0;
		while(n!=0) {
			
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	
	void fibinosi(int n1,int n2) {
		
		System.out.println(n1+" "+n2+" ");
		int n3 = 0;
		for(int i=0;i<=5;i++) {
			
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ReverseString n=new ReverseString();
		n.primenumber(3);
		n.number(1234);
		n.count(1235);
		n.pattern();
		n.swap();
		n.stringreverse();
		
		
		n.fibinosi(0, 1);
		String s="java";
		
		StringBuffer s1=new StringBuffer (s);
		//System.out.println(s1.reverse());
		System.out.println(	s1.substring(1, 4));
		
		int length=s.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
			
		}
		
		System.out.println(rev);
	}

}
