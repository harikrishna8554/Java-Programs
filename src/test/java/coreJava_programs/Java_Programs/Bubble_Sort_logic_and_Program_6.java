package coreJava_programs.Java_Programs;

public class Bubble_Sort_logic_and_Program_6 {
	//bubble sort
	public static void doBubbleSort(int[] array)
	{
		int temp;
		for(int i = 0;i< array.length; i++)
		{
			for(int j = i+1;j< array.length; j++)
			{
				
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		printLogic(array);
	}
	
	public static void printLogic(int[] array)
	{
		for(int a: array)
		{
			System.out.print(a+",");
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {6,4,9,2,1,5,3};
		doBubbleSort(a);
		
		
	}
	
}
