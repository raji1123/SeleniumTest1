package patternpractice;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter the number");
		int n=s.nextInt();//getting number of input from the user to be printed
		int a[]=new int[10];//creating the memory for the input
		  
        System.out.println("enter the number of  array elements ");
        for(int i=0;i<=n;i++) {
        	a[i]=s.nextInt();//reading the elements of the array
        }
		
        System.out.println("the elements are");
        
        for(int i=0;i<=n;i++) {
        	 System.out.print(a[i]);
        	 if(i!=n) {
        		 System.out.print(" ");
        	 }
        }
        
	
	}
}
