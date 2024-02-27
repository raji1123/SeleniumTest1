package codeketa;

public class Binaryserach {

	public static void main(String[] args) {
		
		int key=10;
		int a[]= {1,2,3,4,5,6,7,8,9,10};//should be in sorted order
		
		int l=0;
		int h=a.length-1;
		boolean flag = false;
	while(l<=h) {
		
		int m=(l+h)/2;
		if(a[m]==key) {
			
			System.out.println("element found");
		
			flag=true;
			break;
		}
		//80>50
		 if(key>a[m]) {
			l=m+1;
		}
		 //40<50
		if(key<a[m]) {
			
			h=m-1;
		}
		
	}
		
	
	if(flag==false) {
		System.out.println("element not found");
		
	}



}}
