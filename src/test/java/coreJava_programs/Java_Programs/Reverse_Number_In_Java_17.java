package coreJava_programs.Java_Programs;

import java.util.Scanner;

public class Reverse_Number_In_Java_17 {
	
	
	
	public static void reverseNumber()
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = scn.nextInt();
		int reverse = 0;
		while(number!=0)
		{
			reverse = reverse*10;
			reverse = reverse + number%10;
			number =number/10;
		}
		
		System.out.println("reverse value :"+reverse);
	}

	public static void main(String[] args) {
		
		reverseNumber();
		
	}

}
