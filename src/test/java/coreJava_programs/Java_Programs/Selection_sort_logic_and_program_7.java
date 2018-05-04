package coreJava_programs.Java_Programs;

public class Selection_sort_logic_and_program_7 {
	
	public static void doSelectionSort(int[] array)
	{
		for(int i = 0;i< array.length; i++)
		{		//{3,4,6,5,7,8,9,1,2};
			int index = i;
			for(int j= i+1;j< array.length; j++)
			{
				if(array[j] < array[index])
				{
					index = j;
				}
			}
			int smallerValue = array[index];
			array[index] = array[i];
			array[i] = smallerValue;
		}
		printLogic(array);
	}
	
	public static void printLogic(int[] b)
	{
		for(int array: b)
		{
			System.out.print(array+",");
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {3,4,6,5,7,8,9,1,2};
		doSelectionSort(a);
	}

}
