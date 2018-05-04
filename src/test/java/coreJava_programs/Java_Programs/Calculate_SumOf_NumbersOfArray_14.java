package coreJava_programs.Java_Programs;

public class Calculate_SumOf_NumbersOfArray_14 {
	
	static int[] arr = {10,20,30,40};
	public static int sumOfNumbersOfArray(int[] array)
	{
		int sum = 0;
		for(int a: array)
		{
			sum = sum + a;
			System.out.println(sum);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int print = sumOfNumbersOfArray(arr);
		System.out.println("Final Value :"+print);
		
	}

}
