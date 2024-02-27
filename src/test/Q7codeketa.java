package test;

public class Q7codeketa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int n=5;
	for(int i=0; i<=n; i++) {
			
			for(int j=1; j<=n-i; j++)
			{
			
             	System. out.print("*");
             if (j != n-i) {
             		System. out.print(" ");
             	}
             	
			}
			
		System. out.println();
	}

		
	for(int i=0; i<=n; i++) {
			
			for(int j=1; j<=i; j++)
			{
			
             	System. out.print("*");
             	if (j != i) {
             		System. out.print(" ");
             	}
			}
			
		System. out.println();
	}
	System. out.println();
for(int k=1; k<=n; k++) {
			
			for(int j=1; j<=5; j++)
			{
			
             	System. out.print(j);
             	if (j != n) {
             		System. out.print(" ");
             	}
			}
			
		System. out.println();
		
		
		
		
//q10
/**int n=5;
for(int i=1; i<=n; i++) {
	for(int k=1; k<i;k++)//for(int k=n; k>=n;k--)
	{
		System. out.print(" ");
	}
	for(int j=1; j<=n-i+1; j++)
	{
	
     	System. out.print("*"+" ");
	}*/
	
//System. out.println();
		int n=5;
		for(int i=1;i<=2*n-1;i++) {
			int totalcolinrow=i>n?2*n-i:i;
			
			//for(int k=0;k<n-totalcolinrow;k++) {
				//System. out.print(" ");
			//}
			
			for(int j=1;j<= totalcolinrow ;j++) {
				System. out.print(j+"");
			}
			System. out.println();
			
		}

		
		for(int i=1;i<=2*n-1;i++) {
			
			int totalcolinrow=i>n?2*n-i:i;
			
			int noOfSpace=n-totalcolinrow;//i=1,2,3,4
			
			//(5-(2*5)-1)=5-10-1=4//5-2*5-2=3//
			
			for(int s=0;s<noOfSpace;s++) {
			System. out.print(" ");
		}
			for(int j=1;j<totalcolinrow;j++) {
				System. out.print(j+"");
			}
			System. out.println();}
		
		
		
		
		
		
		
		
}}