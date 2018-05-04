package coreJava_programs.Java_Programs;

public class Is_PrefectNumber_JavaProgram_10 {
	
	public static void perfectNumber(int number)
	{
		int temp = 0;
		for(int i = 1;i<= number/2; i++)
		{
			if(number%i == 0)
			{
				temp = temp + i;
			}
		}
		
		if(temp == number)
		{
			System.out.println(number+": is a perfect number");
		}
		else
		{
			System.out.println(number+": is not  a perfect number");
		}
	}
	
	public static void main(String[] args) {
	
		perfectNumber(28);
		
	}

}
