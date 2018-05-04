package coreJava_programs.Java_Programs;
import java.util.ArrayList;

class Convert_DecimalToBinary_JavaProgram_12
{
	
	public static void decimaltoBinary(int number)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(number > 0)
		{
			al.add(number%2);
			number = number/2;
		}
		
		int size = al.size()-1;
		
		while(size>=0)
		{
			System.out.print(al.get(size)+" ");
			size--;
		}
	}
	
	
	public static void main(String[] args) {
		
		
		decimaltoBinary(4);
	}
}