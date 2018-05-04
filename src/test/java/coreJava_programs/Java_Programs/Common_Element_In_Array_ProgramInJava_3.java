package coreJava_programs.Java_Programs;

public class Common_Element_In_Array_ProgramInJava_3 {
	
	public static void main(String[] args) {
		int[] arr1= {4,7,5,9,6,3};
		int[] arr2= {5,6,4,9,2,4,5,4,6};
		
		for(int i = 0;i < arr1.length; i++)
		{
			for(int j = 0;j < arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(arr1[i]+", ");
				}
			}
		}
	}

}
