package test;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		

    
    Scanner s = new Scanner(System.in);
    System.out.println("enter the total number you want to print");

   int a=s.nextInt();
   
   int[] array=new int[10];
   System.out.println("enter the no of element of the array");
 for (int i=0;i<a;i++){
     array[i]=s.nextInt();//reading the input from the user 
   }
 //Acessing using for lopp
   
 for (int i=0;i<a;i++) {


    System.out.println(array[i]);


}}}