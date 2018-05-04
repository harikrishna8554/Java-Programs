package coreJava_programs.Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Chars_In_String_JavaProgramming_1 {

	String name="bhanupratap";
	
	public void duplicateCharsInString(String str)
	{
		char[] chars = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch:chars)
		{
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(Character ch:keys)
		{
			if(map.get(ch)>1)
			{
				System.out.println(ch+" :"+map.get(ch));
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Duplicate_Chars_In_String_JavaProgramming_1 obj=new Duplicate_Chars_In_String_JavaProgramming_1();
		obj.duplicateCharsInString(obj.name);
		
	}
}
