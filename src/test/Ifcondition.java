package test;
import java.util.Scanner;
public class Ifcondition {

	public static void main(String[] args) {
	/*	int a=10;
		if(a>18) {
			System.out.println("eligible for vote");
		}
		else
			System.out.println("Not eligible for vote");
	}*/




//Array is a collection of data type

int n=5;

for(int i=0;i<n;i++) {
			
			
			for(int k=1;k<n-i;k++) {
				System.out.print(" ");
				
			}
			for(int j=i;j>=0;j--) {
				System.out.print(j);
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		

for(int i=0;i<=2*n-1;i++) {
	int totacolinrow=(i>n)?(2*n-i):i;
	
	//for(int k=1;k<n-i;k++) {
	//	System.out.print(" ");
		
	
	for(int j=1;j<=totacolinrow;j++) {
		System.out.print("*");
	}
	System.out.println();
	}
		
Scanner s = new Scanner(System.in);

System.out.println("enter the number");
int m=s.nextInt();
for(int i=0;i<=2*n-1;i++) {

int totacolinrow=(i>n)?(2*n-i):i;

for(int j=1;j<=totacolinrow;j++)
{
	System.out.print("*");
}
System.out.println();





}
	






}}
		
		

/*int a[] = new int [4];
a[0]=1;
a[1]=1;
a[2]=1;
a[3]=1;
for(int i=0; i<=4-1;i++)
{
	System.out.println(a[i]);
}}}
/**********

b*******b

bb*****bb

bbb***bbb

bbbb*bbbb*/

/*M F F F F F M
  F M C C C M F
  F C M C M C F
  F C C M C C F
  F C M C M C F
  F M C C C M F
  M F F F F F M*/

/*EEEEE
 DDDD
  CCC
   BB
    A*/

/*  0
   101
  21012
 3210123
432101234*/







