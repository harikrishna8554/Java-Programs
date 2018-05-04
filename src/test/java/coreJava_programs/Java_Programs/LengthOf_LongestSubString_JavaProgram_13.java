package coreJava_programs.Java_Programs;

import java.util.HashMap;

public class LengthOf_LongestSubString_JavaProgram_13 {
	
	public static int longestSubString(String str)
	{
		char[] charArray = str.toCharArray();
		int len = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0;i< charArray.length; i++)
		{
			if(!map.containsKey(charArray[i]))
			{
				map.put(charArray[i], i);
			}
			else
			{
				len = Math.max(len,map.size());
				System.out.println(map);
				map.clear();
			}
		}
		System.out.println(map);
		return Math.max(len, map.size());
		
	}	
	
	public static void main(String[] args) {
		
		System.out.println(longestSubString("bhanupratap"));
		
	}

}
