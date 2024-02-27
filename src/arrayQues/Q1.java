package arrayQues;

public class Q1 {

	public static void main(String[] args) {
	int a[]= {3,1,1,4};
	int k;
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				
				k=a[i];
				a[i]=a[j];
				a[j]=k;
				
			}}
	}
	int i=1;
	int freq = 1;
	while(i<a.length) {
		
		if(a[i]==a[i-1]) {
			
			freq++;
			i++;
			
		}
		System.out.println("frequency of "+a[i-1] );
		freq=1;
		i++;
	}
	

	if((a.length==1 ||a[i-1]!=a[i-2]) ){
		System.out.println("frequency of "+a[i-1] );
	}
	
	
		
		
	
	}
}