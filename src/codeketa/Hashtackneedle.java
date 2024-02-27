package codeketa;

public class Hashtackneedle {

	
	
	public static void main(String[] args) {
		

		String s1="haycook";
		String s2="cook";
		for(int i=0;i<s1.length();i++)
		{
		
		if(s1.charAt(i)==s2.charAt(0))
		{
			int j = 0;
		    int	k=i;
			
			while(j<s2.length()&&k<s1.length()&&s2.charAt(j)==s1.charAt(k))
			{
				
				j++;
				k++;
				
				
				
			}
				
				if(j==s2.length()) {
					System.out.println( i);
				}
				else {
					System.out.println( -1);
					
				}
					
		}
		
		}
		
	
	
		
	
	}
	

	
}