package patternpractice;

public class Duplicatevalue {

	public static void main(String[] args) {
		
		String[] s= {"java","java","c++","pytghoj"};
		
		
		boolean flag=false;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				
				if(s[i]==s[j]) {
					
					System.out.println(" duplicte array is"+s[i]);
					//flag=true;
				}
				
				
			}
		}
		
		if(flag=false) {
			System.out.println(" duplicte array not found");
		}
	}

}
