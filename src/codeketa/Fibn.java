package codeketa;

public class Fibn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={10,7,399,3949,8,3939};
		
		int max=a[0];
		int min =a[0];
		
		for(int i=0;i<a.length;i++) {
			
			
			if(a[i]>max) {
				
				max=a[i];
			}
			
			
			if(a[i]<min) {
				
				min=a[i];
			}
			
			
			
			
			
			
		}
		
		
		System.out.println(max+""+"maximum number");
		System.out.println(min+""+"minimum number");
		
		
		
		
	
}}