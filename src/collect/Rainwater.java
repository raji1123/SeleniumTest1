package collect;

public class Rainwater {

	public void m1() {

		int a[] = { 4, 2, 0, 3, 2, 5 };
         int result=0;
		for (int i = 1; i <= a.length - 2; i++)
		{
			int lb = a[i];
			for (int j = 0; j < i; j++)
			{
				if (a[j] > lb) 
				{

					lb = a[j];
				}
			}
			
			int rb = a[i];
			
			
				for (int j = i+1; j < a.length; j++) 
				{
					if (a[j] > rb) 
					{

						rb = a[j];
					 }
				}
				
				int wl;
				if(lb<rb) {
					
					wl=lb;
				}
				
				else {
					
					wl=rb;
				}
				int tw=wl-a[i]; 
				
				result=result+tw;

			}
		
		System.out.println(result);
		
		
		
		}

	

	public static void main(String[] args) {
		
		Rainwater s= new Rainwater();
		s.m1();
		
		
		
		
		
		
		

	}
}