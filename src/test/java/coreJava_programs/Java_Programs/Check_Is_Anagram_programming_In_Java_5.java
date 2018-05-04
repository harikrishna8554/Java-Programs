package coreJava_programs.Java_Programs;

public class Check_Is_Anagram_programming_In_Java_5 {
	
	//2nd string character should match with 1st string character

	String s1 = "abcd";
	String s2 = "bcad";
	public boolean checkAnagram(String a1,String a2)
	{
		char[] s1 = a1.toCharArray();
		StringBuilder s2 = new StringBuilder(a2);
		for(char ch:s1)
		{
			int index = s2.indexOf(""+ch);
			System.out.println(index);
			if(index!=-1)
			{
				s2.deleteCharAt(index);
			}
		}
		
		if(s2.length() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Check_Is_Anagram_programming_In_Java_5 obj = new Check_Is_Anagram_programming_In_Java_5();
		boolean isAnagram = obj.checkAnagram(obj.s1,obj.s2);
		System.out.println("isAnagram: "+isAnagram);
		
	}

}
