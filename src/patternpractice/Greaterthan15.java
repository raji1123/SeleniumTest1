package patternpractice;

import java.util.Scanner;

public class Greaterthan15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
    	int n=s.nextInt();


int a[]=new int [n];
for (int i=0; i<a.length; i++) {
	a[i] = s.nextInt();
	
}


int max=0;
int min=0;
for (int i=0; i<a.length ;i++)
{

	if(a[i]>15) {
		
		
		max=a[i];
	}
	
	else {
		min=a[i];
		
	}

}

System.out.println(max);



}}