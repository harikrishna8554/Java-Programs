package coreJava_programs.Java_Programs;

public class Is_Perfect_Number_18 {


	public static  boolean isPerfect(int number)
	{
		int temp = 0;
		for(int i = 1;i<=number/2; i++)
		{
			if(number%i == 0)
			{
				temp = temp + i;
				System.out.println(temp);
			}
		}
		System.out.println("temp : "+temp);
		if(number == temp)
		{
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		boolean b = isPerfect(28);
		System.out.println(b);
	}
}
