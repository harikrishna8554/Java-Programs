package coreJava_programs.Java_Programs;

import java.util.Scanner;

public class PatternProgram3_22 {
	/**
	1 2 3 4 5 6 7 8 9 
	1 2 3 4 5 6 7 8 
	1 2 3 4 5 6 7 
	1 2 3 4 5 6 
	1 2 3 4 5 
	1 2 3 4 
	1 2 3 
	1 2 
	1 
	**/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter a number :");
		int number = scn.nextInt();
		
		for(int i = number; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
