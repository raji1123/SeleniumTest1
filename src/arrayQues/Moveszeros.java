package arrayQues;
//import java.io.*;
public class Moveszeros {

	public  static void main(String[] args) {
		int a[]= {1,0,2,0,3,9};
		
		int size = a.length-1;
		int z=0; int nz=0;
		int temp;
		while(nz<size) {
		
		if(a[nz]!=0) {
			temp=a[nz];
			a[nz]=a[z];
			a[z]=temp;
			nz++;
			z++;
				
		}
		//System.out.println(a[nz]+a[z]);	
		else {
			nz++;
		}
		
	}
			
}
}