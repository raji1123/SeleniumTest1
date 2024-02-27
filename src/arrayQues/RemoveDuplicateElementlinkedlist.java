package arrayQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicateElementlinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			Scanner sc=new Scanner(System.in);
			
			
			
			int n=sc.nextInt();
			
			int a[]=new int[n];
			for(int i=0;i<a.length;i++) {
				
				
				a[i]=sc.nextInt();
			}
			
		
        
		
	LinkedHashSet<Integer> numbers=new LinkedHashSet<Integer>();
	
	for (int geeks : a) {
		numbers.add(geeks);

	}
	
	StringBuilder sb=new StringBuilder();
	
		
		for(int num:numbers) {
			
			sb.append(num).append(" ");
			
		}
		
		
		System.out.println(sb.toString().trim());
	}

	
}
