package coreJava_programs.Java_Programs;

public class Find_Middle_Index_WhereRightSumEqual_To_LeftSumJavaProgram_11 {
	
	public static int middleIndex(int[] array) throws Exception
	{
		int sumLeft = 0;
		int sumRight = 0;
		
		int startIndex = 0;
		int endIndex = array.length-1;
		
		while(true)
		{
			//{1,2,3,2,3,1};
			if(sumLeft > sumRight)
			{
				sumRight = sumRight+array[endIndex--];
			}
			else
			{
				sumLeft = sumLeft+array[startIndex++];
			}
			
			if(startIndex > endIndex)
			{
				if(sumLeft == sumRight)
				{
					break;
				}
				else
				{
						throw new Exception("Please Enter correct array!");
				}
				
			}
			
		}
		return endIndex;
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		int[] a = {2,4,4,5,4,1};
		
		int value = middleIndex(a);
		System.out.println(value);
		
	}

}
