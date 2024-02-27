package patternpractice;
//import java.util.Scanner;
public class Oddeven {//frequency of the array

	public void abi()
	{
		
		int a[]= {20};
		int i,freq;
	
		freq=1;
		 
		for(i=1;i<a.length;i++)
		{
			if(a[i-1]==a[i]) {
				freq++;
				
				System.out.println(a[i-1] + " "+freq);
				
		}
			freq=1;
		}
		if(a.length==1||a[i-1]!=a[i-2])
		{

			System.out.println(a[i-1] + " "+freq);
			
	
		}
		 

		}
		
		
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		
		Oddeven s= new Oddeven();
		s.abi();
		
		
	}

	
	
	
	
	
	}
