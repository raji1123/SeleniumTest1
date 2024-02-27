package patternpractice;
import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the lowercase string");
        	
        String lowcase=s.next();
      String  uppercase="";
        
        for(int i=0;i<lowcase.length();i++)
        {
        
       char ch=lowcase.charAt(i);
       if(ch>='A'&&ch<='Z') {
    	  ch=(char)(ch+32);
    	  
       }
       uppercase += ch;}
       System.out.println("uppercasecharcter "+  uppercase);}}
  		
