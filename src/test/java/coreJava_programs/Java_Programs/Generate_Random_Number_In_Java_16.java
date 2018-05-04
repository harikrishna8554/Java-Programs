package coreJava_programs.Java_Programs;

import java.util.Random;

public class Generate_Random_Number_In_Java_16 {
	
	public static void generateRandomNumber()
	{
		Random ran = new Random();
		
		for(int i = 0;i < 5; i++)
		{
			int number = ran.nextInt(100);
			System.out.print(number+" ");
		}
	}
	
	public static void main(String[] args) {
		generateRandomNumber();
	}

}
