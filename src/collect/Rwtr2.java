package collect;

public class Rwtr2 {

	public static void main(String[] args) {
		int a[]= {4,2,0,2,3,5};
		int result=0;
		int wl;
		
		for(int i=1;i<=a.length-2;i++) {
			
			int lb=a[i];
			for(int j=0;j<i;j++) {
				
				if(a[j]>lb) 
				{
					
					lb=a[j];
				}
				
				
			}
			int rb=a[i];
			for(int j=i+1;j<a.length;j++) {
								
					if(a[j]>rb)
					{
						
						rb=a[j];
					}
					
			}
				
			
				 if(rb<lb) {
					 
					wl=rb;
					 
				 }
				 else {
					wl=lb;
					 
				 }
			
				int  tw=wl-a[i];
				result=result+tw ;
				 
				
		}
		System.out.println(result)	;
}}