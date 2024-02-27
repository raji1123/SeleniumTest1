package test;

public class Pattern2 {

	public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) { //i is the row
		
		for(int k=1; k<i;k++)//k is the space we want to find the relation between k and i first 4 space ,3,2,1
			//so total  line-row number
		{
			
			System.out.print(" ");
		}
		for(int j=1;j<=n-i+1;j++) {
			System.out.print("*");//j is the star

		}
		
		System.out.println(" ");
	}
	
	
	}}





/*int R=20;
 
	for(int i=1; i<=R; i++) {
		
		for(int j=1; j<=i; j++){
		
      	System. out.print("* ");
		}
		
	System. out.println();*/
		
		//int i=3;
		//int j=5;
		//int R=3;
		/*int k;
		int i;
		int j;
		int R=5;

		for( i=1; i<=R; i++) {//row=3 ,col=5
			
			for(k=1;k<=R-i;k++) 
			{
				System. out.print(" ");
			}
			for(j=1; j<=R-i; j++){//2R-i=5; 2R-2=
			
	      	System. out.print("*");
			}
			
		System. out.println();*/
		
		
		
		
		
		
		
		
		
	