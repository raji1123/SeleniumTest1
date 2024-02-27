package datastructure;

import java.util.Scanner;

import java.util.Arrays;
public class DynamicArray {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	//M*N Matrix
	
	
 //Arrays.sort(a,(int [] a1,int [] b1)->(sum(a1)- sum(b1)));	
	
	
	Scanner sc=new 	Scanner(System.in);
	
	int M=sc.nextInt();
	int N=sc.nextInt();
		
		
		int [][] arr=new int [M][N];
		
		for(int i=0;i<M;i++) {
			
			
			for(int j=0;j<N;j++) {
				
				
				arr[i][j]=sc.nextInt();
				
				
				
				
			}
		}
	
		System.out.println(Arrays.deepToString(arr));
	}
	
		
		
	}


