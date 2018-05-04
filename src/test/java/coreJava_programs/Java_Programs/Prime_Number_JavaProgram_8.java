package coreJava_programs.Java_Programs;

public class Prime_Number_JavaProgram_8 {
	
	static int a = 11;
	
	
	public static void checkPrimeNumber(int n)
	{
		boolean flag = false;
		for(int i = 2; i< n/2; i++)
		{
			if(n%i == 0)
			{
				flag = true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println("The Given number:"+n+" is a Prime number!");
		}
		else
		{
			System.out.println("The Given number:"+n+" is not a Prime number!");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		checkPrimeNumber(a);
		
	}
	
	

}
