package coreJava_programs.Java_Programs;

public class Compress_String_Java_Programming_4 {
	
	String s1="aaabbccd";
	
	public void compressString(String str)
	{
		int count=0;
		char temp = str.charAt(0);
		for(int i = 0;i < str.length(); i++)
		{
			if(str.charAt(i) == temp)
			{
				count++;
			}
			else
			{
				
				System.out.print(temp+""+count);
				count = 1;
				temp=str.charAt(i);
				
			}
		}
		System.out.print(temp+""+count);
	}
	public static void main(String[] args) {
		
		Compress_String_Java_Programming_4 obj = new Compress_String_Java_Programming_4();
		obj.compressString(obj.s1);
		
		
	}

}
