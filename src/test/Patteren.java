package test;
import java.util.Scanner;
public class Patteren {

	public static void main(String[] args) {
		/*int n=5;
		for(int row=1; row<=n;row++) {
			for(int col=1; col<=row;col++)
			{
				System. out.print("*");
			}
		System. out.println();
	}*/

	/*	int n=4;
		
		for(int row=1; row<=n;row++) {
			for(int col=1; col<=n;col++)
			{
				System. out.print("*");
			}
		System. out.println();
	}*/
		
		
		      Scanner s1= new Scanner(System.in);
		       
				//System. out.println("enter the number");
			/*	int n= s.nextInt();
				for(int row=1; row<=n;row++) {
					for(int col=1; col<=n-row+1;col++)
					{
						System. out.print(col+ " ");
					}
				System. out.println("");*/
				
			//	System.out.println("enter the numbers");
				/* double n=s.nextDouble();
			        int m;
			        int sum=0;
			        while(n>0)
			        {
			            m=n%10;
			            sum=sum+m;
			            n=n/10;
			        }

			        System.out.println(sum);*/
		
				/* int a=s.nextInt();
				 int n=5;
					for(int i=1;i<=n;i++){
					 
						 System.out.println(a);*/
				//int R= s.nextInt();
		      // int R=5;
				//for(int row=1; row<=R;row++) {
					
					//////for(int col=1; col<=R-row+1;col++){//
					
		             //	System. out.print(col+" ");
					//}
					
			//	System. out.println();
		      
		      
				
				int n=5;
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
				
				/*for(int row=1;row<=n;row++) {
                     
					for( int cl=2*(n-row);cl>=0;cl-- ){
					System. out.print(" ");
					for(int c2=1;c2<=row;c2++) {
						System. out.print("*"+" ");
					}
					System. out.println();
				}*/
					
				
		      
		       /* Scanner s1 = new Scanner(System.in);
		        System. out.println("enter thenumber of a and n");
		       // int n=3;
		       // int a=2;
		       int a=s1.nextInt();
		       int n=s1.nextInt();
		       for(int i=1;i<=n;i++){
		           System.out.println(a+ " ");
		       }*/
		      
		      
		      
		      
		      
				
				
					
	
}}


		