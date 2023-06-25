package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithNoRepeatingCharacter {

	public static void main(String[] args) {
		longestLengthSubstring("abbac");
		String input="bacca";
		 Map<Character, Integer> visited = new HashMap<>();
		    String output = "";
		    for (int start = 0, end = 0; end < input.length(); end++) {
		        char currChar = input.charAt(end);
		        if (visited.containsKey(currChar)) {
		            start = Math.max(visited.get(currChar)+1, start);
		        }
		        if (output.length() < end - start + 1) {
		            output = input.substring(start, end + 1);
		        }
		        visited.put(currChar, end);
		    }
		    
		    System.out.println(visited);
	}

	public static void longestLengthSubstring(String str) {
		String longestSubString = null;
		int longestSubStringlength = 0;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			Integer ifPresent = map.get(c);// abbac

			if (ifPresent == null) {
				map.put(c, 1);// {a=1,b=1}
		;

			} else {
				i = map.get(c); // {b=1}
				map.clear();
			

			}
		}
		
		if (map.size() > longestSubStringlength) {
			longestSubStringlength = map.size();
			longestSubString = map.keySet().toString();
		}

		System.out.println(longestSubString);
		System.out.println(longestSubStringlength);

	}
}
