package codeketa;

public class Largestnumber {

	public static void main(String[] args) {
		
int a=10;
int b=20;
int c=10;

   int largest=(a>b)?a:b;
   int result=largest>c?largest:c;
   
    System.out.println(result);

    System.out.println("----------");

  if(a>b&&a>c)
  {
	  System.out.println(a);
  }

  else if(b>a&&b>c) {
	  System.out.println(b);
  }
  else {
	  System.out.println(c);
	  
	  
  }

	}

}
