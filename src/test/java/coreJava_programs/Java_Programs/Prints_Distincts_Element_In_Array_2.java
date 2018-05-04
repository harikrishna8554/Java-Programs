package coreJava_programs.Java_Programs;

public class Prints_Distincts_Element_In_Array_2 {
	
	public static void main(String[] args) {
		
		int[] a= {6,5,8,4,5,6,1,4,8,9};
		
		
		for(int i=0;i<a.length;i++)
		{
			boolean isDistinct=false;
			for(int j=0;j<i;j++)
			{
				
				if(a[i]==a[j])
				{
					 isDistinct=true;
					 break;
				}
			}
			
			if(!isDistinct)
			{
				System.out.print(a[i]+",");
			}
		}
	}

}
