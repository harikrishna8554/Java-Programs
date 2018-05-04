package coreJava_programs.Java_Programs;

import java.util.Scanner;

public class PatternProgram5_23 {
	/**
	9 8 7 6 5 4 3 2 1 
	9 8 7 6 5 4 3 2 
	9 8 7 6 5 4 3 
	9 8 7 6 5 4 
	9 8 7 6 5 
	9 8 7 6 
	9 8 7 
	9 8 
	9 
	**/
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Input Data :");
		int number = scn.nextInt();
		
		for(int i = 1; i<=number; i++)
		{
			for(int j = number; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
