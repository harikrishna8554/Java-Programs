package coreJava_programs.Java_Programs;

public class Get_twoMaxNumbers_InArray_InJava_15 {
	
	public static void twoMaxNumbers(int[] array)
	{
		int First = 0;
		int second = 0;
		
		for(int arr: array)
		{
			if(First < arr)
			{
				second = First;
				First = arr;
			}
			else if(second < arr)
			{
				second = arr;
			}
		}
		System.out.println("First: "+First);
		System.out.println("Second: "+second);
	}
	
	public static void main(String[] args) {
		
		int[] a={45,86,124,64,15,94,69,99,209};
		twoMaxNumbers(a);
		
		
	}

}
