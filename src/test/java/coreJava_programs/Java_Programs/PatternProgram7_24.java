package coreJava_programs.Java_Programs;

public class PatternProgram7_24 {
	
	/**
	1 2 3 4 5 6 7 
	1 2 3 4 5 6 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 
	1 2 3 4 5 6 
	1 2 3 4 5 6 7 
	**/
	
	public static void main(String[] args) {
		for(int i = 7; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int k = 2; k<=7; k++)
		{
			
			for(int l = 1; l<=k; l++)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}

}
